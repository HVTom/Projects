import React, { useState } from "react";
import { Text, StyleSheet, TouchableOpacity, View } from "react-native";
import darkMode from "./darkMode";
/*
<View style={styles.middle}>
      <FlatList
        showsVerticalScrollIndicator={false}
        data={note}
        renderItem={({ item }) => (
          <TouchableOpacity>
            <View style={styles.notita}>
              <Text
                style={styles.notitaText}
                onPress={() => OnDeleteHandler(item.key)}
              >
                {item.val}
              </Text>
            </View>
          </TouchableOpacity>
        )}
      />
    </View>

    //onPress={() => OnDeleteHandler(item.key)}
*/

export default function Nota({ item , OnDeleteHandler, colorScheme, goToEdit}) {
  return (
    //<TouchableOpacity onPress={() => OnDeleteHandler(item.key)}>
    <TouchableOpacity onPress={() => goToEdit()}>
      <View style={colorScheme == 'light' ? styles.notita : darkMode.notita}>
        <Text style={colorScheme == 'light' ? styles.notitaText : darkMode.notitaText}>{item.val}</Text>
      </View>
    </TouchableOpacity>
  );
}

const styles = StyleSheet.create({
  notita: {
    height: 40,
    alignItems: "flex-start",
    marginTop: 10,
    marginBottom: 10,
    borderWidth: 1,
    borderColor: "black",
    borderRadius: 10,
  },
  notitaText: {
    textAlign: "center",
    color: 'black',
    padding: 8,
    marginLeft: 10,
  },
});

