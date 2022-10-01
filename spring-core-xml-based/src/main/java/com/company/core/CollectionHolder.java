package com.company.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionHolder {
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private List<Player> players;

    public List<String> getMyList() {
        return myList;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }
}
