import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormDashboardComponent } from './form-dashboard/form-dashboard.component';
import { NewFormFormatComponent} from './new-form-format/new-form-format.component';
const routes: Routes = [{path: 'form-dashboard', component: FormDashboardComponent},
                        {path: 'new-form-format', component: NewFormFormatComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
