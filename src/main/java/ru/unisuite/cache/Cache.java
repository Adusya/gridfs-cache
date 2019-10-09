package ru.unisuite.cache;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletResponse;

public class Cache {

	public Boolean put(String idInCache, Map<String, Object> parameters) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public CompletableFuture<Boolean> putAsync(String idInCache, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean get(String idInCache, OutputStream out, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String getHashById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean deleteItem(String id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public CompletableFuture<Boolean> deleteItemAsync(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void applyDowntine(long downtime) {
		// TODO Auto-generated method stub
		
	}

	
	public FileOutputStream getFileOutputStream(String nodeName, String idInCache) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void increaseHits() {
		// TODO Auto-generated method stub
		
	}

	
	public void increaseMisses() {
		// TODO Auto-generated method stub
		
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean connectionIsUp() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void close() {
		// TODO Auto-generated method stub
		
	}

	
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	
	public void writeToTwoStreams(String idInCache, Blob blobObject, OutputStream os1, OutputStream os2)
			throws IOException, SQLException {
		// TODO Auto-generated method stub
		
	}

	
	public OutputStream openStream(String key) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getStatistics() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
