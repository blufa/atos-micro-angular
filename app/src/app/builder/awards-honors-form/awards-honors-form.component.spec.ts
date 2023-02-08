import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AwardsHonorsFormComponent } from './awards-honors-form.component';

describe('AwardsHonorsFormComponent', () => {
  let component: AwardsHonorsFormComponent;
  let fixture: ComponentFixture<AwardsHonorsFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AwardsHonorsFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AwardsHonorsFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
