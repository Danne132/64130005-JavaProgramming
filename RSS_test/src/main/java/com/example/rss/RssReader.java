package com.example.rss;

import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class RssReader {
    public static void main(String[] args) throws URISyntaxException {
        String feedUrl = "https://vnexpress.net/rss/tin-moi-nhat.rss"; // Ví dụ RSS feed từ VnExpress

        try {
            URI uri = new URI(feedUrl);
            
            URL url = uri.toURL();
            
            XmlReader reader = new XmlReader(url);
            SyndFeed feed = new SyndFeedInput().build(reader);

            System.out.println("Feed Title: " + feed.getTitle());
            System.out.println("Feed Description: " + feed.getDescription());
            System.out.println("-----------------------------------------------------");

            List<SyndEntry> entries = feed.getEntries();
            for (SyndEntry entry : entries) {
                System.out.println("Title: " + entry.getTitle());
                System.out.println("Link: " + entry.getLink());
                System.out.println("Published Date: " + entry.getPublishedDate());
                System.out.println("-----------------------------------------------------");
            }

        } catch (IOException e) {
            System.err.println("Không thể đọc RSS feed: " + e.getMessage());
        } catch (FeedException e) {
            System.err.println("Lỗi khi phân tích RSS feed: " + e.getMessage());
        }
    }
}
