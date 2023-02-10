import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SocialIconCircleComponent } from './social-icon-circle.component';

describe('SocialIconCircleComponent', () => {
  let component: SocialIconCircleComponent;
  let fixture: ComponentFixture<SocialIconCircleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SocialIconCircleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SocialIconCircleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
