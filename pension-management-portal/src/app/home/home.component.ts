import { Component, OnInit } from '@angular/core';
import { AuthService } from '../login/login/auth.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private authService: AuthService) { }
  public loggedIn: boolean = false;
  ngOnInit(): void {
    if(this.authService.isLoggedIn()) {
      this.loggedIn= true;
    }
  }

}
