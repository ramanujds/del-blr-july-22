import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GitUserComponent } from './git-user.component';

describe('GitUserComponent', () => {
  let component: GitUserComponent;
  let fixture: ComponentFixture<GitUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GitUserComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GitUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
