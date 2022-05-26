import React, { useState } from "react";
import { StatusBar } from "expo-status-bar";
import {
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableOpacity,
  FlatList,
  Keyboard,
  TouchableWithoutFeedback,
  Alert,
  useColorScheme,
} from "react-native";
import Nota from "./components/Nota";
import darkMode from "./components/darkMode";



export default function App() {
  const [text, setText] = useState("");
  const [note, setNote] = useState([
    { val: "Scrie notita in bara de jos", key: 1 },
    { val: "Apasa + ca sa o adaugi in carnetel", key: 2 },
    { val: "Apasa pe caseta ca sa stergi notita", key: 3 },
  ]);
  const colorScheme = useColorScheme();
  console.log("your color scheme is: " + colorScheme);

  const OnAddHandler = async (text) => {
    if (text.length == 0) {
      Alert.alert("Hopa!!", "Nota nu poate sa fie vida!", [
        {
          text: "OK",
          onPress: () => console.log("Alert closed"),
        },
      ]);
    } else {
      setNote((prevTodos) => {
        return [{ val: text, key: Math.random().toString() }, ...prevTodos];
      });
      setText("");
      Keyboard.dismiss();
    }
  };

  

  // const OnDeleteHandler = (key) => {
  //   setNote((continut) => {
  //     return continut.filter((note) => note.key != key);
  //   });
  // };




  return (
    <TouchableWithoutFeedback onPress={() => Keyboard.dismiss()}>
      <View
        style={colorScheme == "light" ? styles.container : darkMode.container}
      >
        <StatusBar style="auto" />

        {/**titlu sus */}
        <View style={styles.sus}>
          <Text style={colorScheme == "light" ? styles.title : darkMode.title}>
            Notepad
          </Text>
          <Text
            style={colorScheme == "light" ? styles.nrNotite : darkMode.nrNotite}
          >
            Nr. notițe: {note.length}
          </Text>
        </View>
        {/**titlu sus */}

        {/**lista-mijloc */}
        <View style={colorScheme == "light" ? styles.middle : darkMode.middle}>
          <FlatList
            showsVerticalScrollIndicator={false}
            data={note}
            renderItem={({ item }) => (
              <Nota
                item={item}
                // OnDeleteHandler={OnDeleteHandler}
                goToEdit={goToEdit}
                colorScheme={colorScheme}
              />
            )}
          />
        </View>
        {/**lista-mijloc */}

        {/**input section jos*/}
        <View
          style={
            colorScheme == "light" ? styles.inputSection : darkMode.inputSection
          }
        >
          <TextInput
            style={colorScheme == "light" ? styles.input : darkMode.input}
            autoComplete={false}
            placeholder="Input Todo"
            placeholderTextColor="gray"
            value={text}
            onChangeText={(text) => setText(text)}
          />
          <TouchableOpacity onPress={() => OnAddHandler(text)}>
            <Text style={colorScheme == "light" ? styles.add : darkMode.add}>
              +
            </Text>
          </TouchableOpacity>
        </View>
        {/**input section jos */}
      </View>
    </TouchableWithoutFeedback>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 40,
    backgroundColor: "#fff",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
  },
  nrNotite: {
    color: "black",
  },
  sus: {
    flex: 2,
  },
  title: {
    fontSize: 28,
    color: "black",
  },
  middle: {
    flex: 8,
    width: "100%",
  },
  // notita: {
  //   height: 40,
  //   alignItems: "flex-start",
  //   marginTop: 10,
  //   marginBottom: 10,
  //   borderWidth: 1,
  //   borderColor: "black",
  //   borderRadius: 10,
  // },
  // notitaText: {
  //   textAlign: "center",
  //   padding: 8,
  //   marginLeft: 10,
  // },
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
    borderColor: "black",
    borderWidth: 1,
    borderRadius: 10,
  },
  add: {
    padding: 8,
    height: 40,
    fontSize: 18,
    marginLeft: 25,
    borderColor: "black",
    color: "black",
    borderWidth: 1,
    borderRadius: 10,
    textAlign: "center",
    width: 34,
  },
});
