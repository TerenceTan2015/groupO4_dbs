import React, {Component} from 'react';
import dbsnavbar from './DBS_Nav.JPG';
export default class FirstComponent extends Component {
constructor(props) {
    super(props)
  }
render() {
    const element = (<div>Text from Element</div>)
    return (<div className="container-black">
      {this.props.displaytext}
	  <img src={dbsnavbar}></img>
    </div>)
  }
}