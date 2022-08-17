import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddPersonReactiveComponent } from './add-person-reactive.component';

describe('AddPersonReactiveComponent', () => {
  let component: AddPersonReactiveComponent;
  let fixture: ComponentFixture<AddPersonReactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddPersonReactiveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddPersonReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
