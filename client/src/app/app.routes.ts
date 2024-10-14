import { Routes } from '@angular/router';
import { UserComponent } from './components/user/user.component';
import { ChatComponent } from './components/chat/chat.component';

export const routes: Routes = [
    { path: 'user', component: UserComponent },
    { path: 'chat', component: ChatComponent }
];
