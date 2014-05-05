/**
*    Copyright (c) 2011-2014, OpenIoT
*   
*    This file is part of OpenIoT.
*
*    OpenIoT is free software: you can redistribute it and/or modify
*    it under the terms of the GNU Lesser General Public License as published by
*    the Free Software Foundation, version 3 of the License.
*
*    OpenIoT is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU Lesser General Public License for more details.
*
*    You should have received a copy of the GNU Lesser General Public License
*    along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
*
*     Contact: OpenIoT mailto: info@openiot.eu
 * @author Ali Salehi
*/

package org.openiot.gsn.wrappers.tinyos;

/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'Sensorscope'
 * message type.
 */

public class SensorscopeMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 26;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 128;

    /** Create a new Sensorscope of size 26. */
    public SensorscopeMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new Sensorscope of the given data_length. */
    public SensorscopeMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Sensorscope with the given data_length
     * and base offset.
     */
    public SensorscopeMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Sensorscope using the given byte array
     * as backing store.
     */
    public SensorscopeMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Sensorscope using the given byte array
     * as backing store, with the given base offset.
     */
    public SensorscopeMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Sensorscope using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public SensorscopeMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Sensorscope embedded in the given message
     * at the given base offset.
     */
    public SensorscopeMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Sensorscope embedded in the given message
     * at the given base offset and length.
     */
    public SensorscopeMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <Sensorscope> \n";
      try {
        s += "  [ntwSenderId=0x"+Long.toHexString(get_ntwSenderId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [ntwDistToBS=0x"+Long.toHexString(get_ntwDistToBS())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [tspHopCount=0x"+Long.toHexString(get_tspHopCount())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [tspPacketSN=0x"+Long.toHexString(get_tspPacketSN())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [reporterId=0x"+Long.toHexString(get_reporterId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [timestamp=0x"+Long.toHexString(get_timestamp())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rainMeter=0x"+Long.toHexString(get_rainMeter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [windSpeed=0x"+Long.toHexString(get_windSpeed())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [watermark=0x"+Long.toHexString(get_watermark())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [solarRadiation=0x"+Long.toHexString(get_solarRadiation())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [airTemperature=0x"+Long.toHexString(get_airTemperature())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [airHumidity=0x"+Long.toHexString(get_airHumidity())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [skinTemperature=0x"+Long.toHexString(get_skinTemperature())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [soilMoisture=0x"+Long.toHexString(get_soilMoisture())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [windDirection=0x"+Long.toHexString(get_windDirection())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [foo=0x"+Long.toHexString(get_foo())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: ntwSenderId
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'ntwSenderId' is signed (false).
     */
    public static boolean isSigned_ntwSenderId() {
        return false;
    }

    /**
     * Return whether the field 'ntwSenderId' is an array (false).
     */
    public static boolean isArray_ntwSenderId() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'ntwSenderId'
     */
    public static int offset_ntwSenderId() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'ntwSenderId'
     */
    public static int offsetBits_ntwSenderId() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'ntwSenderId'
     */
    public short get_ntwSenderId() {
        return (short)getUIntBEElement(offsetBits_ntwSenderId(), 8);
    }

    /**
     * Set the value of the field 'ntwSenderId'
     */
    public void set_ntwSenderId(short value) {
        setUIntBEElement(offsetBits_ntwSenderId(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'ntwSenderId'
     */
    public static int size_ntwSenderId() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'ntwSenderId'
     */
    public static int sizeBits_ntwSenderId() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: ntwDistToBS
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'ntwDistToBS' is signed (false).
     */
    public static boolean isSigned_ntwDistToBS() {
        return false;
    }

    /**
     * Return whether the field 'ntwDistToBS' is an array (false).
     */
    public static boolean isArray_ntwDistToBS() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'ntwDistToBS'
     */
    public static int offset_ntwDistToBS() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'ntwDistToBS'
     */
    public static int offsetBits_ntwDistToBS() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'ntwDistToBS'
     */
    public short get_ntwDistToBS() {
        return (short)getUIntBEElement(offsetBits_ntwDistToBS(), 8);
    }

    /**
     * Set the value of the field 'ntwDistToBS'
     */
    public void set_ntwDistToBS(short value) {
        setUIntBEElement(offsetBits_ntwDistToBS(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'ntwDistToBS'
     */
    public static int size_ntwDistToBS() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'ntwDistToBS'
     */
    public static int sizeBits_ntwDistToBS() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: tspHopCount
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'tspHopCount' is signed (false).
     */
    public static boolean isSigned_tspHopCount() {
        return false;
    }

    /**
     * Return whether the field 'tspHopCount' is an array (false).
     */
    public static boolean isArray_tspHopCount() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'tspHopCount'
     */
    public static int offset_tspHopCount() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'tspHopCount'
     */
    public static int offsetBits_tspHopCount() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'tspHopCount'
     */
    public short get_tspHopCount() {
        return (short)getUIntBEElement(offsetBits_tspHopCount(), 8);
    }

    /**
     * Set the value of the field 'tspHopCount'
     */
    public void set_tspHopCount(short value) {
        setUIntBEElement(offsetBits_tspHopCount(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'tspHopCount'
     */
    public static int size_tspHopCount() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'tspHopCount'
     */
    public static int sizeBits_tspHopCount() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: tspPacketSN
    //   Field type: short, unsigned
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'tspPacketSN' is signed (false).
     */
    public static boolean isSigned_tspPacketSN() {
        return false;
    }

    /**
     * Return whether the field 'tspPacketSN' is an array (false).
     */
    public static boolean isArray_tspPacketSN() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'tspPacketSN'
     */
    public static int offset_tspPacketSN() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'tspPacketSN'
     */
    public static int offsetBits_tspPacketSN() {
        return 24;
    }

    /**
     * Return the value (as a short) of the field 'tspPacketSN'
     */
    public short get_tspPacketSN() {
        return (short)getUIntBEElement(offsetBits_tspPacketSN(), 8);
    }

    /**
     * Set the value of the field 'tspPacketSN'
     */
    public void set_tspPacketSN(short value) {
        setUIntBEElement(offsetBits_tspPacketSN(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'tspPacketSN'
     */
    public static int size_tspPacketSN() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'tspPacketSN'
     */
    public static int sizeBits_tspPacketSN() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: reporterId
    //   Field type: short, unsigned
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'reporterId' is signed (false).
     */
    public static boolean isSigned_reporterId() {
        return false;
    }

    /**
     * Return whether the field 'reporterId' is an array (false).
     */
    public static boolean isArray_reporterId() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'reporterId'
     */
    public static int offset_reporterId() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'reporterId'
     */
    public static int offsetBits_reporterId() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'reporterId'
     */
    public short get_reporterId() {
        return (short)getUIntBEElement(offsetBits_reporterId(), 8);
    }

    /**
     * Set the value of the field 'reporterId'
     */
    public void set_reporterId(short value) {
        setUIntBEElement(offsetBits_reporterId(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'reporterId'
     */
    public static int size_reporterId() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'reporterId'
     */
    public static int sizeBits_reporterId() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: timestamp
    //   Field type: long, unsigned
    //   Offset (bits): 40
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'timestamp' is signed (false).
     */
    public static boolean isSigned_timestamp() {
        return false;
    }

    /**
     * Return whether the field 'timestamp' is an array (false).
     */
    public static boolean isArray_timestamp() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'timestamp'
     */
    public static int offset_timestamp() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'timestamp'
     */
    public static int offsetBits_timestamp() {
        return 40;
    }

    /**
     * Return the value (as a long) of the field 'timestamp'
     */
    public long get_timestamp() {
        return (long)getUIntBEElement(offsetBits_timestamp(), 32);
    }

    /**
     * Set the value of the field 'timestamp'
     */
    public void set_timestamp(long value) {
        setUIntBEElement(offsetBits_timestamp(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'timestamp'
     */
    public static int size_timestamp() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'timestamp'
     */
    public static int sizeBits_timestamp() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rainMeter
    //   Field type: short, unsigned
    //   Offset (bits): 72
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rainMeter' is signed (false).
     */
    public static boolean isSigned_rainMeter() {
        return false;
    }

    /**
     * Return whether the field 'rainMeter' is an array (false).
     */
    public static boolean isArray_rainMeter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rainMeter'
     */
    public static int offset_rainMeter() {
        return (72 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rainMeter'
     */
    public static int offsetBits_rainMeter() {
        return 72;
    }

    /**
     * Return the value (as a short) of the field 'rainMeter'
     */
    public short get_rainMeter() {
        return (short)getUIntBEElement(offsetBits_rainMeter(), 8);
    }

    /**
     * Set the value of the field 'rainMeter'
     */
    public void set_rainMeter(short value) {
        setUIntBEElement(offsetBits_rainMeter(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'rainMeter'
     */
    public static int size_rainMeter() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rainMeter'
     */
    public static int sizeBits_rainMeter() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: windSpeed
    //   Field type: short, unsigned
    //   Offset (bits): 80
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'windSpeed' is signed (false).
     */
    public static boolean isSigned_windSpeed() {
        return false;
    }

    /**
     * Return whether the field 'windSpeed' is an array (false).
     */
    public static boolean isArray_windSpeed() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'windSpeed'
     */
    public static int offset_windSpeed() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'windSpeed'
     */
    public static int offsetBits_windSpeed() {
        return 80;
    }

    /**
     * Return the value (as a short) of the field 'windSpeed'
     */
    public short get_windSpeed() {
        return (short)getUIntBEElement(offsetBits_windSpeed(), 8);
    }

    /**
     * Set the value of the field 'windSpeed'
     */
    public void set_windSpeed(short value) {
        setUIntBEElement(offsetBits_windSpeed(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'windSpeed'
     */
    public static int size_windSpeed() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'windSpeed'
     */
    public static int sizeBits_windSpeed() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: watermark
    //   Field type: int, unsigned
    //   Offset (bits): 88
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'watermark' is signed (false).
     */
    public static boolean isSigned_watermark() {
        return false;
    }

    /**
     * Return whether the field 'watermark' is an array (false).
     */
    public static boolean isArray_watermark() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'watermark'
     */
    public static int offset_watermark() {
        return (88 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'watermark'
     */
    public static int offsetBits_watermark() {
        return 88;
    }

    /**
     * Return the value (as a int) of the field 'watermark'
     */
    public int get_watermark() {
        return (int)getUIntBEElement(offsetBits_watermark(), 16);
    }

    /**
     * Set the value of the field 'watermark'
     */
    public void set_watermark(int value) {
        setUIntBEElement(offsetBits_watermark(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'watermark'
     */
    public static int size_watermark() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'watermark'
     */
    public static int sizeBits_watermark() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: solarRadiation
    //   Field type: int, unsigned
    //   Offset (bits): 104
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'solarRadiation' is signed (false).
     */
    public static boolean isSigned_solarRadiation() {
        return false;
    }

    /**
     * Return whether the field 'solarRadiation' is an array (false).
     */
    public static boolean isArray_solarRadiation() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'solarRadiation'
     */
    public static int offset_solarRadiation() {
        return (104 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'solarRadiation'
     */
    public static int offsetBits_solarRadiation() {
        return 104;
    }

    /**
     * Return the value (as a int) of the field 'solarRadiation'
     */
    public int get_solarRadiation() {
        return (int)getUIntBEElement(offsetBits_solarRadiation(), 16);
    }

    /**
     * Set the value of the field 'solarRadiation'
     */
    public void set_solarRadiation(int value) {
        setUIntBEElement(offsetBits_solarRadiation(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'solarRadiation'
     */
    public static int size_solarRadiation() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'solarRadiation'
     */
    public static int sizeBits_solarRadiation() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: airTemperature
    //   Field type: int, unsigned
    //   Offset (bits): 120
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'airTemperature' is signed (false).
     */
    public static boolean isSigned_airTemperature() {
        return false;
    }

    /**
     * Return whether the field 'airTemperature' is an array (false).
     */
    public static boolean isArray_airTemperature() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'airTemperature'
     */
    public static int offset_airTemperature() {
        return (120 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'airTemperature'
     */
    public static int offsetBits_airTemperature() {
        return 120;
    }

    /**
     * Return the value (as a int) of the field 'airTemperature'
     */
    public int get_airTemperature() {
        return (int)getUIntBEElement(offsetBits_airTemperature(), 16);
    }

    /**
     * Set the value of the field 'airTemperature'
     */
    public void set_airTemperature(int value) {
        setUIntBEElement(offsetBits_airTemperature(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'airTemperature'
     */
    public static int size_airTemperature() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'airTemperature'
     */
    public static int sizeBits_airTemperature() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: airHumidity
    //   Field type: int, unsigned
    //   Offset (bits): 136
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'airHumidity' is signed (false).
     */
    public static boolean isSigned_airHumidity() {
        return false;
    }

    /**
     * Return whether the field 'airHumidity' is an array (false).
     */
    public static boolean isArray_airHumidity() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'airHumidity'
     */
    public static int offset_airHumidity() {
        return (136 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'airHumidity'
     */
    public static int offsetBits_airHumidity() {
        return 136;
    }

    /**
     * Return the value (as a int) of the field 'airHumidity'
     */
    public int get_airHumidity() {
        return (int)getUIntBEElement(offsetBits_airHumidity(), 16);
    }

    /**
     * Set the value of the field 'airHumidity'
     */
    public void set_airHumidity(int value) {
        setUIntBEElement(offsetBits_airHumidity(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'airHumidity'
     */
    public static int size_airHumidity() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'airHumidity'
     */
    public static int sizeBits_airHumidity() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: skinTemperature
    //   Field type: int, unsigned
    //   Offset (bits): 152
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'skinTemperature' is signed (false).
     */
    public static boolean isSigned_skinTemperature() {
        return false;
    }

    /**
     * Return whether the field 'skinTemperature' is an array (false).
     */
    public static boolean isArray_skinTemperature() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'skinTemperature'
     */
    public static int offset_skinTemperature() {
        return (152 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'skinTemperature'
     */
    public static int offsetBits_skinTemperature() {
        return 152;
    }

    /**
     * Return the value (as a int) of the field 'skinTemperature'
     */
    public int get_skinTemperature() {
        return (int)getUIntBEElement(offsetBits_skinTemperature(), 16);
    }

    /**
     * Set the value of the field 'skinTemperature'
     */
    public void set_skinTemperature(int value) {
        setUIntBEElement(offsetBits_skinTemperature(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'skinTemperature'
     */
    public static int size_skinTemperature() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'skinTemperature'
     */
    public static int sizeBits_skinTemperature() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: soilMoisture
    //   Field type: int, unsigned
    //   Offset (bits): 168
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'soilMoisture' is signed (false).
     */
    public static boolean isSigned_soilMoisture() {
        return false;
    }

    /**
     * Return whether the field 'soilMoisture' is an array (false).
     */
    public static boolean isArray_soilMoisture() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'soilMoisture'
     */
    public static int offset_soilMoisture() {
        return (168 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'soilMoisture'
     */
    public static int offsetBits_soilMoisture() {
        return 168;
    }

    /**
     * Return the value (as a int) of the field 'soilMoisture'
     */
    public int get_soilMoisture() {
        return (int)getUIntBEElement(offsetBits_soilMoisture(), 16);
    }

    /**
     * Set the value of the field 'soilMoisture'
     */
    public void set_soilMoisture(int value) {
        setUIntBEElement(offsetBits_soilMoisture(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'soilMoisture'
     */
    public static int size_soilMoisture() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'soilMoisture'
     */
    public static int sizeBits_soilMoisture() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: windDirection
    //   Field type: int, unsigned
    //   Offset (bits): 184
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'windDirection' is signed (false).
     */
    public static boolean isSigned_windDirection() {
        return false;
    }

    /**
     * Return whether the field 'windDirection' is an array (false).
     */
    public static boolean isArray_windDirection() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'windDirection'
     */
    public static int offset_windDirection() {
        return (184 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'windDirection'
     */
    public static int offsetBits_windDirection() {
        return 184;
    }

    /**
     * Return the value (as a int) of the field 'windDirection'
     */
    public int get_windDirection() {
        return (int)getUIntBEElement(offsetBits_windDirection(), 16);
    }

    /**
     * Set the value of the field 'windDirection'
     */
    public void set_windDirection(int value) {
        setUIntBEElement(offsetBits_windDirection(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'windDirection'
     */
    public static int size_windDirection() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'windDirection'
     */
    public static int sizeBits_windDirection() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: foo
    //   Field type: short, unsigned
    //   Offset (bits): 200
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'foo' is signed (false).
     */
    public static boolean isSigned_foo() {
        return false;
    }

    /**
     * Return whether the field 'foo' is an array (false).
     */
    public static boolean isArray_foo() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'foo'
     */
    public static int offset_foo() {
        return (200 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'foo'
     */
    public static int offsetBits_foo() {
        return 200;
    }

    /**
     * Return the value (as a short) of the field 'foo'
     */
    public short get_foo() {
        return (short)getUIntBEElement(offsetBits_foo(), 8);
    }

    /**
     * Set the value of the field 'foo'
     */
    public void set_foo(short value) {
        setUIntBEElement(offsetBits_foo(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'foo'
     */
    public static int size_foo() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'foo'
     */
    public static int sizeBits_foo() {
        return 8;
    }

}
