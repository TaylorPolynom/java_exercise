/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLinkedList.challange;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEKSANDAR
 */
public class Album {
   private String name;
   private ArrayList<Song>songs;

    public Album(String name) {
        this.name = name;
        this.songs=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

 

    public List<Song> getSongs() {
        return songs;
    }

    public void addSongToAlbum(String nameAlbum,String songName,String duration){
    if(this.name.equals(nameAlbum)){
    Song song =new Song(songName, duration);
    songs.add(song);
        //System.out.println("Added "+song.getTitle());
    }
    
    
    }
     
    
    
   
}
