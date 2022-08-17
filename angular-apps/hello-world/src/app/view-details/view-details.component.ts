import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-details',
  templateUrl: './view-details.component.html',
  styleUrls: ['./view-details.component.css']
})
export class ViewDetailsComponent implements OnInit {

  constructor(private _route:ActivatedRoute) { }

  id:any;

  ngOnInit(): void {

      this._route.params.subscribe(
        param=>{
          this.id=param['id']
        }
      )

  }

}
