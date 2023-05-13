/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.curso.stream.kafka.spkafkastreamdemo.schemas;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmploymentDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8158741868144329822L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmploymentDetail\",\"namespace\":\"com.curso.stream.kafka.spkafkastreamdemo.schemas\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"employmentType\",\"type\":\"string\"},{\"name\":\"inHandSalary\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"location\",\"type\":\"string\"},{\"name\":\"netSalary\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"organizationName\",\"type\":\"string\"},{\"name\":\"position\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EmploymentDetail> ENCODER =
      new BinaryMessageEncoder<EmploymentDetail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EmploymentDetail> DECODER =
      new BinaryMessageDecoder<EmploymentDetail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<EmploymentDetail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<EmploymentDetail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EmploymentDetail>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this EmploymentDetail to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a EmploymentDetail from a ByteBuffer. */
  public static EmploymentDetail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence address;
  @Deprecated public java.lang.CharSequence employmentType;
  @Deprecated public java.math.BigDecimal inHandSalary;
  @Deprecated public java.lang.CharSequence location;
  @Deprecated public java.math.BigDecimal netSalary;
  @Deprecated public java.lang.CharSequence organizationName;
  @Deprecated public java.lang.CharSequence position;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EmploymentDetail() {}

  /**
   * All-args constructor.
   * @param address The new value for address
   * @param employmentType The new value for employmentType
   * @param inHandSalary The new value for inHandSalary
   * @param location The new value for location
   * @param netSalary The new value for netSalary
   * @param organizationName The new value for organizationName
   * @param position The new value for position
   */
  public EmploymentDetail(java.lang.CharSequence address, java.lang.CharSequence employmentType, java.math.BigDecimal inHandSalary, java.lang.CharSequence location, java.math.BigDecimal netSalary, java.lang.CharSequence organizationName, java.lang.CharSequence position) {
    this.address = address;
    this.employmentType = employmentType;
    this.inHandSalary = inHandSalary;
    this.location = location;
    this.netSalary = netSalary;
    this.organizationName = organizationName;
    this.position = position;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return address;
    case 1: return employmentType;
    case 2: return inHandSalary;
    case 3: return location;
    case 4: return netSalary;
    case 5: return organizationName;
    case 6: return position;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: address = (java.lang.CharSequence)value$; break;
    case 1: employmentType = (java.lang.CharSequence)value$; break;
    case 2: inHandSalary = (java.math.BigDecimal)value$; break;
    case 3: location = (java.lang.CharSequence)value$; break;
    case 4: netSalary = (java.math.BigDecimal)value$; break;
    case 5: organizationName = (java.lang.CharSequence)value$; break;
    case 6: position = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'employmentType' field.
   * @return The value of the 'employmentType' field.
   */
  public java.lang.CharSequence getEmploymentType() {
    return employmentType;
  }

  /**
   * Sets the value of the 'employmentType' field.
   * @param value the value to set.
   */
  public void setEmploymentType(java.lang.CharSequence value) {
    this.employmentType = value;
  }

  /**
   * Gets the value of the 'inHandSalary' field.
   * @return The value of the 'inHandSalary' field.
   */
  public java.math.BigDecimal getInHandSalary() {
    return inHandSalary;
  }

  /**
   * Sets the value of the 'inHandSalary' field.
   * @param value the value to set.
   */
  public void setInHandSalary(java.math.BigDecimal value) {
    this.inHandSalary = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public java.lang.CharSequence getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(java.lang.CharSequence value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'netSalary' field.
   * @return The value of the 'netSalary' field.
   */
  public java.math.BigDecimal getNetSalary() {
    return netSalary;
  }

  /**
   * Sets the value of the 'netSalary' field.
   * @param value the value to set.
   */
  public void setNetSalary(java.math.BigDecimal value) {
    this.netSalary = value;
  }

  /**
   * Gets the value of the 'organizationName' field.
   * @return The value of the 'organizationName' field.
   */
  public java.lang.CharSequence getOrganizationName() {
    return organizationName;
  }

  /**
   * Sets the value of the 'organizationName' field.
   * @param value the value to set.
   */
  public void setOrganizationName(java.lang.CharSequence value) {
    this.organizationName = value;
  }

  /**
   * Gets the value of the 'position' field.
   * @return The value of the 'position' field.
   */
  public java.lang.CharSequence getPosition() {
    return position;
  }

  /**
   * Sets the value of the 'position' field.
   * @param value the value to set.
   */
  public void setPosition(java.lang.CharSequence value) {
    this.position = value;
  }

  /**
   * Creates a new EmploymentDetail RecordBuilder.
   * @return A new EmploymentDetail RecordBuilder
   */
  public static com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder newBuilder() {
    return new com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder();
  }

  /**
   * Creates a new EmploymentDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EmploymentDetail RecordBuilder
   */
  public static com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder newBuilder(com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder other) {
    return new com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder(other);
  }

  /**
   * Creates a new EmploymentDetail RecordBuilder by copying an existing EmploymentDetail instance.
   * @param other The existing instance to copy.
   * @return A new EmploymentDetail RecordBuilder
   */
  public static com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder newBuilder(com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail other) {
    return new com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder(other);
  }

  /**
   * RecordBuilder for EmploymentDetail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmploymentDetail>
    implements org.apache.avro.data.RecordBuilder<EmploymentDetail> {

    private java.lang.CharSequence address;
    private java.lang.CharSequence employmentType;
    private java.math.BigDecimal inHandSalary;
    private java.lang.CharSequence location;
    private java.math.BigDecimal netSalary;
    private java.lang.CharSequence organizationName;
    private java.lang.CharSequence position;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employmentType)) {
        this.employmentType = data().deepCopy(fields()[1].schema(), other.employmentType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.inHandSalary)) {
        this.inHandSalary = data().deepCopy(fields()[2].schema(), other.inHandSalary);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.netSalary)) {
        this.netSalary = data().deepCopy(fields()[4].schema(), other.netSalary);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.organizationName)) {
        this.organizationName = data().deepCopy(fields()[5].schema(), other.organizationName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.position)) {
        this.position = data().deepCopy(fields()[6].schema(), other.position);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EmploymentDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employmentType)) {
        this.employmentType = data().deepCopy(fields()[1].schema(), other.employmentType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.inHandSalary)) {
        this.inHandSalary = data().deepCopy(fields()[2].schema(), other.inHandSalary);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.netSalary)) {
        this.netSalary = data().deepCopy(fields()[4].schema(), other.netSalary);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.organizationName)) {
        this.organizationName = data().deepCopy(fields()[5].schema(), other.organizationName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.position)) {
        this.position = data().deepCopy(fields()[6].schema(), other.position);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.address = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearAddress() {
      address = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'employmentType' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmploymentType() {
      return employmentType;
    }

    /**
      * Sets the value of the 'employmentType' field.
      * @param value The value of 'employmentType'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setEmploymentType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.employmentType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'employmentType' field has been set.
      * @return True if the 'employmentType' field has been set, false otherwise.
      */
    public boolean hasEmploymentType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'employmentType' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearEmploymentType() {
      employmentType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'inHandSalary' field.
      * @return The value.
      */
    public java.math.BigDecimal getInHandSalary() {
      return inHandSalary;
    }

    /**
      * Sets the value of the 'inHandSalary' field.
      * @param value The value of 'inHandSalary'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setInHandSalary(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.inHandSalary = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'inHandSalary' field has been set.
      * @return True if the 'inHandSalary' field has been set, false otherwise.
      */
    public boolean hasInHandSalary() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'inHandSalary' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearInHandSalary() {
      inHandSalary = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public java.lang.CharSequence getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setLocation(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.location = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'location' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearLocation() {
      location = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'netSalary' field.
      * @return The value.
      */
    public java.math.BigDecimal getNetSalary() {
      return netSalary;
    }

    /**
      * Sets the value of the 'netSalary' field.
      * @param value The value of 'netSalary'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setNetSalary(java.math.BigDecimal value) {
      validate(fields()[4], value);
      this.netSalary = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'netSalary' field has been set.
      * @return True if the 'netSalary' field has been set, false otherwise.
      */
    public boolean hasNetSalary() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'netSalary' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearNetSalary() {
      netSalary = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'organizationName' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrganizationName() {
      return organizationName;
    }

    /**
      * Sets the value of the 'organizationName' field.
      * @param value The value of 'organizationName'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setOrganizationName(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.organizationName = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'organizationName' field has been set.
      * @return True if the 'organizationName' field has been set, false otherwise.
      */
    public boolean hasOrganizationName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'organizationName' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearOrganizationName() {
      organizationName = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'position' field.
      * @return The value.
      */
    public java.lang.CharSequence getPosition() {
      return position;
    }

    /**
      * Sets the value of the 'position' field.
      * @param value The value of 'position'.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder setPosition(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.position = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'position' field has been set.
      * @return True if the 'position' field has been set, false otherwise.
      */
    public boolean hasPosition() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'position' field.
      * @return This builder.
      */
    public com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail.Builder clearPosition() {
      position = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EmploymentDetail build() {
      try {
        EmploymentDetail record = new EmploymentDetail();
        record.address = fieldSetFlags()[0] ? this.address : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.employmentType = fieldSetFlags()[1] ? this.employmentType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.inHandSalary = fieldSetFlags()[2] ? this.inHandSalary : (java.math.BigDecimal) defaultValue(fields()[2]);
        record.location = fieldSetFlags()[3] ? this.location : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.netSalary = fieldSetFlags()[4] ? this.netSalary : (java.math.BigDecimal) defaultValue(fields()[4]);
        record.organizationName = fieldSetFlags()[5] ? this.organizationName : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.position = fieldSetFlags()[6] ? this.position : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EmploymentDetail>
    WRITER$ = (org.apache.avro.io.DatumWriter<EmploymentDetail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EmploymentDetail>
    READER$ = (org.apache.avro.io.DatumReader<EmploymentDetail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
