import React from "react";
import { View, Text, StyleSheet, TextInput } from "react-native";
import { Feather } from "@expo/vector-icons";

const SearchBar = ({ term, onTermChange }) => {
  return (
    <View style={styles.backgroundStyle}>
      <Feather name="search" size={30} color="black" style={styles.iconStyle} />
      <TextInput
        autoCapitalize="none"
        autoCorrect={false}
        style={styles.inputStyle}
        placeholder="Search"

        value={term}
        onChangeText={newTerm => onTermChange(newTerm)}
        //onChangeText={onTermChange}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  backgroundStyle: {
    backgroundColor: "#adb2c7",
    height: 50,
    borderRadius: 10,
    marginHorizontal: 15,
    flexDirection: "row",
    marginTop: 15,
    marginBottom: 10
  },
  inputStyle: {
    borderColor: "black",
    // borderWidth: 1,
    flex: 1,
    width: "70%",
    fontSize: 18,
  },
  iconStyle: {
    alignSelf: "center",
    marginHorizontal: 15,
  },
});

export default SearchBar;
