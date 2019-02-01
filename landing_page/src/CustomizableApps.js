import React, {Component} from 'react';
import qr from './qr-icon.JPG';
import autodebit from './autodebit-icon.JPG';
import question from './question-icon.JPG';
import transfer from './transfer-icon.JPG';
import add from './add-icon.jpg';

export default class CustomizableApps extends Component {
constructor(props) {
    super(props)
  }
render() {
    return (<div className="comptext">
    <div className="title">Favourites</div>
      {this.props.displaytext}
	  <div class="icon-bar">
<a class="active" href="#"><img src={qr} width="50" height="50"></img></a> 
<a href="#"><img src={question} width="50" height="50"></img></a> 
  <a href="#"><img src={autodebit} width="50" height="50"></img></a> 
  <a href="#"><img src={transfer} width="50" height="50"></img></a>
  <a href="#"><img src={add} width="50" height="50"></img></a> 
</div>

    </div>
	)
  }
}