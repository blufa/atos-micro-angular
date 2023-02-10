import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-builder-form',
  templateUrl: './builder-form.component.html',
  styleUrls: ['./builder-form.component.scss']
})
export class BuilderFormComponent implements OnInit {
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

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
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
