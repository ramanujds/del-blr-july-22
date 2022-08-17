import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { GithubUser } from '../GithubUser';

@Component({
  selector: 'app-git-user',
  templateUrl: './git-user.component.html',
  styleUrls: ['./git-user.component.css']
})
export class GitUserComponent implements OnInit {

  constructor(private _githubClient:HttpClient) { }

  ngOnInit(): void {
  }
  user?:GithubUser;

  getGithubUserInfo(username:string){
    this._githubClient.get("https://api.github.com/users/"+username)
        .subscribe(
          data => this.user=data
        )
  }

}
