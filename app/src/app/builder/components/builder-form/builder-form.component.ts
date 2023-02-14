import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BuilderFormService } from '../../services/builder-form.service';
import { NotificationService } from '../../../shared/services/notification.service';

@Component({
  selector: 'app-builder-form',
  templateUrl: './builder-form.component.html',
  styleUrls: ['./builder-form.component.scss']
})
export class BuilderFormComponent implements OnInit {
  id: string;
  candidateForm: FormGroup;
  educationForm: FormGroup;
  leisuresForm: FormGroup;
  certificationsForm: FormGroup;
  skillsForm: FormGroup;
  referencesForm: FormGroup;
  languagesForm: FormGroup;
  workExperiencesForm: FormGroup;
  awardsHonorsForm: FormGroup;

  form: FormGroup;

  constructor(
      private formBuilder: FormBuilder, 
      private activatedRoute: ActivatedRoute, 
      private builderService: BuilderFormService, 
      private router: Router,
      private notify: NotificationService,
    ) { 

    }

  ngOnInit(): void {
    // get resume id if we're updating
    const paramMap = this.activatedRoute.snapshot.paramMap;

    if (paramMap.has('resumeId')) {
      const id = paramMap.get('resumeId');

      this.builderService.getResume(id!).subscribe((resume) => {
        this.createForm(resume);
      });
    } else {
      this.createForm();
    }
  }

  createForm(resume?: any): void {
    if (resume != undefined) {
      this.form = this.formBuilder.group({
        candidate: this.formBuilder.group({
          firstName: ['', [Validators.required, Validators.min(2)]],
          lastName: ['', [Validators.required, Validators.min(2)]],
          email: ['', [Validators.required, Validators.email]],
          address: ['', [Validators.required, Validators.min(3)]],
          phoneNumber: ['', [Validators.required, Validators.min(9), Validators.max(12)]],
          dob: [''],
          occupation: ['', [Validators.required, Validators.min(5)]],
          photoUrl: [''],
          externalLinks: this.formBuilder.array([])
        }),
        education: new FormArray(resume.education.map((edu: any) => new FormGroup({
          schoolName: new FormControl(edu.schoolName, [Validators.required, Validators.minLength(3)]),
          diploma: new FormControl(edu.diploma, [Validators.required, Validators.minLength(3)]),
          startDate: new FormControl(edu.startDate, [Validators.required]),
          endDate: new FormControl(edu.endDate)
        }))),
        leisures: new FormArray(resume.leisures.map((leisure: any) => new FormControl(leisure, [Validators.required, Validators.minLength(3)]))),
        certifications: new FormArray(resume.certifications.map((certification: any) => new FormGroup({
          name: new FormControl(certification.name, [Validators.required, Validators.minLength(3)]),
          year: new FormControl(certification.year, [Validators.required, Validators.minLength(4), Validators.maxLength(4), Validators.min(1900), Validators.max(new Date().getFullYear())])
        }))),
        skills: new FormArray(resume.skills.map((skill: any) => new FormGroup({
          name: new FormControl(skill.name, [Validators.required, Validators.minLength(2)]),
          level: new FormControl(skill.level, [Validators.required])
        }))),
        references: new FormArray(resume.references.map((ref: any) => new FormGroup({
          fullName: new FormControl(ref.fullName, [Validators.required, Validators.minLength(5)]),
          phoneNumber: new FormControl(ref.phoneNumber, [Validators.required, Validators.minLength(9), Validators.maxLength(12)]),
          email: new FormControl(ref.email, [Validators.required, Validators.email]),
          jobTitle: new FormControl(ref.jobTitle, [Validators.required, Validators.minLength(3)]),
          company: new FormControl(ref.company, [Validators.required, Validators.minLength(2)])
        }))),
        languages: new FormArray(resume.languages.map((language: any) => new FormGroup({
          name: new FormControl(language.name, [Validators.required, Validators.minLength(2)]),
          level: new FormControl(language.level, [Validators.required])
        }))),
        workExperiences: new FormArray(resume.workExperiences.map((work: any) => new FormGroup({
          company: new FormControl(work.company, [Validators.required, Validators.minLength(2)]),
          jobTitle: new FormControl(work.jobTitle, [Validators.required, Validators.minLength(3)]),
          jobDescription: new FormControl(work.jobDescription, [Validators.required, Validators.minLength(20)]),
          startDate: new FormControl(work.startDate, [Validators.required]),
          endDate: new FormControl(work.endDate)
        }))),
        awardsHonors: new FormArray(resume.awardsHonors.map((awardsHonors: any) => new FormGroup({
          name: new FormControl(awardsHonors.name, [Validators.required, Validators.minLength(3)]),
          year: new FormControl(awardsHonors.year, [Validators.required, Validators.minLength(4), Validators.maxLength(4), Validators.min(1900), Validators.max(new Date().getFullYear())])
        }))),
      });

      return;
    }

    this.form = this.formBuilder.group({
      candidate: this.formBuilder.group({
        firstName: ['', [Validators.required, Validators.min(2)]],
        lastName: ['', [Validators.required, Validators.min(2)]],
        email: ['', [Validators.required, Validators.email]],
        address: ['', [Validators.required, Validators.min(3)]],
        phoneNumber: ['', [Validators.required, Validators.min(9), Validators.max(12)]],
        dob: [''],
        occupation: ['', [Validators.required, Validators.min(5)]],
        photoUrl: [''],
        externalLinks: this.formBuilder.array([])
      }),
      education: this.formBuilder.array([]),
      leisures: this.formBuilder.array([]),
      certifications: this.formBuilder.array([]),
      skills: this.formBuilder.array([]),
      references: this.formBuilder.array([]),
      languages: this.formBuilder.array([]),
      workExperiences: this.formBuilder.array([]),
      awardsHonors: this.formBuilder.array([]),
    });
  }

  onSubmit(): void {
    if(this.form.valid){
      this.builderService.saveResume(this.form)
                          .subscribe({
                            next: ()=>{
                              this.notify.success(`Resume ${ this.form.get('id')?.value ? 'updated' : 'added' } successfully`, "Success");
                              this.router.navigate(['/dashboard'])
                            },
                            error: (err) => console.log(err)
                          })
    }
    console.log(this.form.value);
  }

  getCandidateForm(): FormGroup {
    return this.form.get("candidate") as FormGroup;
  }

  getEducationForm(): FormArray {
    return this.form.get("education") as FormArray;
  }

  getLeisuresForm(): FormArray {
    return this.form.get("leisures") as FormArray;
  }

  getCertificationsForm(): FormArray {
    return this.form.get("certifications") as FormArray;
  }

  getSkillsForm(): FormArray {
    return this.form.get("skills") as FormArray;
  }

  getReferencesForm(): FormArray {
    return this.form.get("references") as FormArray;
  }

  getLanguagesForm(): FormArray {
    return this.form.get("languages") as FormArray;
  }

  getWorkExperiencesForm(): FormArray {
    return this.form.get("workExperiences") as FormArray;
  }

  getAwardsHonorsForm(): FormArray {
    return this.form.get("awardsHonors") as FormArray;
  }
}
