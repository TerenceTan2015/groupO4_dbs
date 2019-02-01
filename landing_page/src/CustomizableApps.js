import React, {Component} from 'react';
export default class CustomizableApps extends Component {
constructor(props) {
    super(props)
  }
render() {
    return (<div className="comptext">
    <h3>Customizable apps</h3>
      {this.props.displaytext}
	  <div class="icon-bar">
  <a class="active" href="#"><i class="fa fa-home"></i></a> 
  <a href="#"><i class="fa fa-search"></i></a> 
  <a href="#"><i class="fa fa-envelope"></i></a> 
  <a href="#"><i class="fa fa-globe"></i></a>
  <a href="#"><i class="fa fa-trash"></i></a> 
</div>
    </div>)
  }
}