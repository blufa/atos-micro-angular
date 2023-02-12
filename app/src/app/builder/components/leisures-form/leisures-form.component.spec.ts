import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LeisuresFormComponent } from './leisures-form.component';

describe('LeisuresFormComponent', () => {
  let component: LeisuresFormComponent;
  let fixture: ComponentFixture<LeisuresFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LeisuresFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LeisuresFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
