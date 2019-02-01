import React, {Component} from 'react';
export default class CustomizableApps extends Component {
constructor(props) {
    super(props)
  }
render() {
    const element = (<div>Text from Element</div>)
    return (<div className="comptext">
    <h3>Customizable apps</h3>
      {this.props.displaytext}
      {element}
    </div>)
  }
}