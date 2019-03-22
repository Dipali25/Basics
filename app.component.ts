import { Component, NgModule, HostListener, HostBinding } from '@angular/core';
import { SalaryService } from './salary.service';
import { OrgComponent } from './org/org.component';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})

@NgModule({
    providers: [
        SalaryService
    ]
})


export class AppComponent extends OrgComponent{
    title = 'Contentprojection';

    @HostListener('click', ['$event'])
    onClick(event) {
    }

    @HostBinding('class:red-text')
    hasredText = true;
}

