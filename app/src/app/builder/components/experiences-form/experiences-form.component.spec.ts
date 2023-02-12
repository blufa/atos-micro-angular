import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExperiencesFormComponent } from './experiences-form.component';

describe('ExperiencesFormComponent', () => {
  let component: ExperiencesFormComponent;
  let fixture: ComponentFixture<ExperiencesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExperiencesFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExperiencesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
