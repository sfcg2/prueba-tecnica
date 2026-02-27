import { Routes } from '@angular/router';
import { Home } from './home/home';
import { ListEvents } from './components/list-events/list-events';

export const routes: Routes = [

    {path: '', component: ListEvents,},
];
