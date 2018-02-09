package com.chandlertu.java.samples;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class FilesTests {

  @Test
  public void deleteFile() throws URISyntaxException {
    Path path = Paths.get(getClass().getResource("file.txt").toURI());
    assertThat(path.toFile().exists()).isTrue();
    try {
      Files.delete(path);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertThat(path.toFile().exists()).isFalse();
  }

  @Test
  public void deleteEmptyDir() throws URISyntaxException {
    Path parent = Paths.get(getClass().getResource("").toURI());
    System.out.println(parent);
    Path path = parent.resolve("empty-dir");

    System.out.println(path);
    assertThat(path.toFile().exists()).isTrue();
    try {
      Files.delete(path);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertThat(path.toFile().exists()).isFalse();
  }
  
  @Test
  public void deleteDir() throws URISyntaxException {
    Path parent = Paths.get(getClass().getResource("").toURI());
    System.out.println(parent);
    Path path = parent.resolve("dir");

    System.out.println(path);
    assertThat(path.toFile().exists()).isTrue();
    try {
      Files.delete(path);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertThat(path.toFile().exists()).isFalse();
  }


}
