/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.videoplaza.avro.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MessageBatch extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4000934239665377708L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageBatch\",\"namespace\":\"com.videoplaza.avro.schema\",\"fields\":[{\"name\":\"messages\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Message\",\"fields\":[{\"name\":\"data\",\"type\":\"bytes\"},{\"name\":\"attributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null}]}},\"doc\":\"List of messages\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** List of messages */
  @Deprecated public java.util.List<com.videoplaza.avro.schema.Message> messages;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageBatch() {}

  /**
   * All-args constructor.
   * @param messages List of messages
   */
  public MessageBatch(java.util.List<com.videoplaza.avro.schema.Message> messages) {
    this.messages = messages;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return messages;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: messages = (java.util.List<com.videoplaza.avro.schema.Message>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'messages' field.
   * @return List of messages
   */
  public java.util.List<com.videoplaza.avro.schema.Message> getMessages() {
    return messages;
  }

  /**
   * Sets the value of the 'messages' field.
   * List of messages
   * @param value the value to set.
   */
  public void setMessages(java.util.List<com.videoplaza.avro.schema.Message> value) {
    this.messages = value;
  }

  /**
   * Creates a new MessageBatch RecordBuilder.
   * @return A new MessageBatch RecordBuilder
   */
  public static com.videoplaza.avro.schema.MessageBatch.Builder newBuilder() {
    return new com.videoplaza.avro.schema.MessageBatch.Builder();
  }

  /**
   * Creates a new MessageBatch RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageBatch RecordBuilder
   */
  public static com.videoplaza.avro.schema.MessageBatch.Builder newBuilder(com.videoplaza.avro.schema.MessageBatch.Builder other) {
    return new com.videoplaza.avro.schema.MessageBatch.Builder(other);
  }

  /**
   * Creates a new MessageBatch RecordBuilder by copying an existing MessageBatch instance.
   * @param other The existing instance to copy.
   * @return A new MessageBatch RecordBuilder
   */
  public static com.videoplaza.avro.schema.MessageBatch.Builder newBuilder(com.videoplaza.avro.schema.MessageBatch other) {
    return new com.videoplaza.avro.schema.MessageBatch.Builder(other);
  }

  /**
   * RecordBuilder for MessageBatch instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageBatch>
    implements org.apache.avro.data.RecordBuilder<MessageBatch> {

    /** List of messages */
    private java.util.List<com.videoplaza.avro.schema.Message> messages;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.videoplaza.avro.schema.MessageBatch.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.messages)) {
        this.messages = data().deepCopy(fields()[0].schema(), other.messages);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MessageBatch instance
     * @param other The existing instance to copy.
     */
    private Builder(com.videoplaza.avro.schema.MessageBatch other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.messages)) {
        this.messages = data().deepCopy(fields()[0].schema(), other.messages);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'messages' field.
      * List of messages
      * @return The value.
      */
    public java.util.List<com.videoplaza.avro.schema.Message> getMessages() {
      return messages;
    }

    /**
      * Sets the value of the 'messages' field.
      * List of messages
      * @param value The value of 'messages'.
      * @return This builder.
      */
    public com.videoplaza.avro.schema.MessageBatch.Builder setMessages(java.util.List<com.videoplaza.avro.schema.Message> value) {
      validate(fields()[0], value);
      this.messages = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'messages' field has been set.
      * List of messages
      * @return True if the 'messages' field has been set, false otherwise.
      */
    public boolean hasMessages() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'messages' field.
      * List of messages
      * @return This builder.
      */
    public com.videoplaza.avro.schema.MessageBatch.Builder clearMessages() {
      messages = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public MessageBatch build() {
      try {
        MessageBatch record = new MessageBatch();
        record.messages = fieldSetFlags()[0] ? this.messages : (java.util.List<com.videoplaza.avro.schema.Message>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
