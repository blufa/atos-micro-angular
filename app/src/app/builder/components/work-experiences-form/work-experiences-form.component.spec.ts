import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkExperiencesFormComponent } from './work-experiences-form.component';

describe('WorkExperiencesFormComponent', () => {
  let component: WorkExperiencesFormComponent;
  let fixture: ComponentFixture<WorkExperiencesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WorkExperiencesFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WorkExperiencesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
