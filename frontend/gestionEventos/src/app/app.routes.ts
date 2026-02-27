import { Routes } from '@angular/router';
import { ListEvents } from './components/list-events/list-events';
import { AddEvents } from './components/add-events/add-events';

export const routes: Routes = [

    {path: 'eventos', component: ListEvents,},
    {path: 'agregar', component: AddEvents,},
];
