import { ApplicationConfig, provideBrowserGlobalErrorListeners } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideHttpClient } from '@angular/common/http';
//¿Te aparece el archivo app.config.ts en tu carpeta src/app? 
// Ahí es donde registraremos el provideHttpClient para que tu Angular 
// pueda hablar con tu Backend de Spring.

export const appConfig: ApplicationConfig = {
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideRouter(routes),
    provideHttpClient()
  ]
};
