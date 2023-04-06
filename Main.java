/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLinkedList.challange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ALEKSANDAR
 */
public class Main {
        static ArrayList<Album> albums = new ArrayList<>();
       static  LinkedList<String> playlist = new LinkedList<>();
    public static void main(String[] args) {
       
        Album album1 = new Album("Album1");
        album1.addSongToAlbum("Album1", "Song1", "3:03");
        album1.addSongToAlbum("Album1", "Song2", "3:03");
        Album album2 = new Album("Album2");
        album2.addSongToAlbum("Album2", "Song12", "3:03");
        album2.addSongToAlbum("Album2", "Song22", "3:03");
//        for(int i=0;i<album1.getSongs().size();i++){
//      String name= album1.getSongs().get(i).getTitle();
//        System.out.println(name);
//        }

        albums.add(album1);
        albums.add(album2);
        for (int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);
            for (int j = 0; j < album.getSongs().size(); j++) {
                String name = album.getSongs().get(j).getTitle();
                playlist.add(name);
                System.out.println("Song inside " + name);
            }

        }
            System.out.println("size of playList: "+playlist.size());
            addSongToPlayList("Song3");
             System.out.println("size of playList: "+playlist.size());
            addSongToPlayList("Song3");
             System.out.println("size of playList: "+playlist.size());
             addSongToPlayList("Song4");
             System.out.println("size of playList: "+playlist.size());
             
             
           readAll(playlist);
            
            
    }
    public static  void addSongToPlayList(String nameSong){
    if(findSong(nameSong)){
        playlist.add(nameSong);
        System.out.println("Song added");
    //do Nothing
    }
    
    }

    private static boolean  findSong(String nameSong) {
     Iterator iterator =playlist.iterator();
     while(iterator.hasNext()){
     if(iterator.next().equals(nameSong)){
         System.out.println("Do nothing!");
         return false;
     }
     }
          
            return true;
        }
    
    
    public static void readAll(LinkedList<String>linkedlist){
    int count=1;
    Iterator iterator=linkedlist.iterator();
    while(iterator.hasNext()){
        System.out.println(count+": -> "+iterator.next());
        count++;
    }
    
    }
    
    
    
    }

