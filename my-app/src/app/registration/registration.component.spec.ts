import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {
  regForm: FormGroup;
  submittedData: any = null;

  courses = ['Angular', 'React', 'Java', 'Python'];

  constructor(private fb: FormBuilder) {
    this.regForm = this.fb.group({
      fullName: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern(/^\d{10}$/)]],
      gender: ['', Validators.required],
      course: ['', Validators.required],
      address: ['']
    });
  }

  get f() { return this.regForm.controls; }

  onSubmit() {
    if (this.regForm.invalid) {
      this.regForm.markAllAsTouched();
      return;
    }
    this.submittedData = this.regForm.value;
  }

  onReset() {
    this.regForm.reset();
    this.submittedData = null;
  }
}
