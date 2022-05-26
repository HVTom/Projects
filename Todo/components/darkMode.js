import React from "react";
import { StyleSheet } from "react-native";

const darkMode = StyleSheet.create({
  container: {
    flex: 1,
    padding: 40,
    backgroundColor: "black",
    color: 'white',
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
  },
  nrNotite: {
    color: 'white'
  },
  sus: {
    flex: 2,
    color: 'white',
  },
  title: {
    fontSize: 28,
    color: 'white',
  },
  middle: {
    flex: 8,
    width: "100%",
    color: "white"
  },
  notita: {
    height: 40,
    alignItems: "flex-start",
    marginTop: 10,
    marginBottom: 10,
    borderWidth: 1,
    borderColor: "white",
    color: "white",
    borderRadius: 10,
  },
  notitaText: {
    color: 'white',
    textAlign: "center",
    padding: 8,
    marginLeft: 10,
  },
  inputSection: {
    flex: 1,
    marginBottom: -20,
    flexDirection: "row",
    alignContent: "space-around",
    alignItems: "center",
  },
  input: {
    padding: 8,
    height: 40,
    fontSize: 18,
    width: "90%",
    borderColor: "white",
    color: 'white',
    borderWidth: 1,
    borderRadius: 10,
  },
  add: {
    padding: 8,
    height: 40,
    fontSize: 18,
    marginLeft: 25,
    borderColor: "white",
    color: 'white',
    borderWidth: 1,
    borderRadius: 10,
    textAlign: "center",
    width: 34,
  },
});


export default darkMode;