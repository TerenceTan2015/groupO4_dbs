import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import FirstComponent from './FirstComponent'
import CustomizableApps from './CustomizableApps'
import DataVisualization from './DataVisualization'
import NavBar from './NavBar'
class App extends Component {
  render() {
    return (
      <div className="App">
		<div>
		<FirstComponent displaytext=""/>
		</div>
		
		<div className="container-black">
		<NavBar displaytext=""/>
		</div>
		
		<div className="container">
		<CustomizableApps displaytext=""/>
		</div>
		
		<div className="container">
		<DataVisualization displaytext="Data visualization here"/>
		</div>
		
      </div>
    );
  }
}

export default App;
