import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';  // ✅ Add this

@Component({
  selector: 'app-registration',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],   // ✅ Fix here
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']     // ✅ Use styleUrls (plural)
})
export class RegistrationComponent {

  regForm: FormGroup;
  submittedData: any = null;

  courses = ['Angular', 'React', 'Java', 'Python'];  // ✅ Now dropdown will show

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

  get f() {
    return this.regForm.controls;
  }

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
