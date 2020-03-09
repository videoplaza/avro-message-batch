package com.videoplaza.avro.schema;

import org.junit.Test;

import java.nio.ByteBuffer;

import static org.junit.Assert.assertEquals;

public class MessageTest {

   @Test public void testData() {
      Record m = Record.newBuilder()
          .setData(ByteBuffer.wrap("Expected".getBytes()))
          .build();

      assertEquals("Expected", new String(m.getData().array()));
   }

}
