import React, {Component} from 'react';
import qr from './qr-icon.JPG';
import autodebit from './autodebit-icon.JPG';
import question from './question-icon.JPG';
import transfer from './transfer-icon.JPG';
import add from './add-icon.jpg';

export default class NavBar extends Component {
constructor(props) {
    super(props)
  }
render() {
    return (<div className="comptext">
      {this.props.displaytext}
	  <div class="icon-bar">
<a class="active" href="#">My Account</a> 
<a href="#">Transfers</a> 
  <a href="#">Pay</a> 
  <a href="#">Cards</a>
  <a href="#">Plan</a> 
</div>

    </div>
	)
  }
}