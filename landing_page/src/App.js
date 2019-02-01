import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import FirstComponent from './FirstComponent'
import CustomizableApps from './CustomizableApps'
import DataVisualization from './DataVisualization'
class App extends Component {
  render() {
    return (
      <div className="App">
		<FirstComponent displaytext="Header goes here"/>
		<CustomizableApps displaytext="Customizable apps here"/>
		<DataVisualization displaytext="Data visualization here"/>
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
		  
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

export default App;
