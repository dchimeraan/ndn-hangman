package com.example.cs217b.ndn_hangman;

public final class ChatbufProto {
    private ChatbufProto() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface ChatMessageOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required string to = 1;
        /**
         * <code>required string to = 1;</code>
         */
        boolean hasTo();
        /**
         * <code>required string to = 1;</code>
         */
        java.lang.String getTo();
        /**
         * <code>required string to = 1;</code>
         */
        com.google.protobuf.ByteString
        getToBytes();

        // required string from = 2;
        /**
         * <code>required string from = 2;</code>
         */
        boolean hasFrom();
        /**
         * <code>required string from = 2;</code>
         */
        java.lang.String getFrom();
        /**
         * <code>required string from = 2;</code>
         */
        com.google.protobuf.ByteString
        getFromBytes();

        // required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];
        /**
         * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
         */
        boolean hasType();
        /**
         * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
         */
        com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType getType();

        // optional string data = 4;
        /**
         * <code>optional string data = 4;</code>
         */
        boolean hasData();
        /**
         * <code>optional string data = 4;</code>
         */
        java.lang.String getData();
        /**
         * <code>optional string data = 4;</code>
         */
        com.google.protobuf.ByteString
        getDataBytes();

        // required int32 timestamp = 5;
        /**
         * <code>required int32 timestamp = 5;</code>
         */
        boolean hasTimestamp();
        /**
         * <code>required int32 timestamp = 5;</code>
         */
        int getTimestamp();
    }
    /**
     * Protobuf type {@code com.example.cs217b.ndn_hangman.ChatMessage}
     */
    public static final class ChatMessage extends
            com.google.protobuf.GeneratedMessage
            implements ChatMessageOrBuilder {
        // Use ChatMessage.newBuilder() to construct.
        private ChatMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private ChatMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final ChatMessage defaultInstance;
        public static ChatMessage getDefaultInstance() {
            return defaultInstance;
        }

        public ChatMessage getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private ChatMessage(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            to_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            from_ = input.readBytes();
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();
                            com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType value = com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(3, rawValue);
                            } else {
                                bitField0_ |= 0x00000004;
                                type_ = value;
                            }
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            data_ = input.readBytes();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            timestamp_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.cs217b.ndn_hangman.ChatbufProto.internal_static_net_named_data_jndn_tests_ChatMessage_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.cs217b.ndn_hangman.ChatbufProto.internal_static_net_named_data_jndn_tests_ChatMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.class, com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.Builder.class);
        }

        public static com.google.protobuf.Parser<ChatMessage> PARSER =
                new com.google.protobuf.AbstractParser<ChatMessage>() {
                    public ChatMessage parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ChatMessage(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<ChatMessage> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType}
         */
        public enum ChatMessageType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>CHAT = 0;</code>
             */
            CHAT(0, 0),
            /**
             * <code>HELLO = 1;</code>
             */
            HELLO(1, 1),
            /**
             * <code>LEAVE = 2;</code>
             */
            LEAVE(2, 2),
            /**
             * <code>JOIN = 3;</code>
             */
            JOIN(3, 3),
            /**
             * <code>OTHER = 4;</code>
             */
            OTHER(4, 4),
            ;

            /**
             * <code>CHAT = 0;</code>
             */
            public static final int CHAT_VALUE = 0;
            /**
             * <code>HELLO = 1;</code>
             */
            public static final int HELLO_VALUE = 1;
            /**
             * <code>LEAVE = 2;</code>
             */
            public static final int LEAVE_VALUE = 2;
            /**
             * <code>JOIN = 3;</code>
             */
            public static final int JOIN_VALUE = 3;
            /**
             * <code>OTHER = 4;</code>
             */
            public static final int OTHER_VALUE = 4;


            public final int getNumber() { return value; }

            public static ChatMessageType valueOf(int value) {
                switch (value) {
                    case 0: return CHAT;
                    case 1: return HELLO;
                    case 2: return LEAVE;
                    case 3: return JOIN;
                    case 4: return OTHER;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<ChatMessageType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<ChatMessageType>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<ChatMessageType>() {
                        public ChatMessageType findValueByNumber(int number) {
                            return ChatMessageType.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.getDescriptor().getEnumTypes().get(0);
            }

            private static final ChatMessageType[] VALUES = values();

            public static ChatMessageType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private ChatMessageType(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType)
        }

        private int bitField0_;
        // required string to = 1;
        public static final int TO_FIELD_NUMBER = 1;
        private java.lang.Object to_;
        /**
         * <code>required string to = 1;</code>
         */
        public boolean hasTo() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string to = 1;</code>
         */
        public java.lang.String getTo() {
            java.lang.Object ref = to_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    to_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string to = 1;</code>
         */
        public com.google.protobuf.ByteString
        getToBytes() {
            java.lang.Object ref = to_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                to_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string from = 2;
        public static final int FROM_FIELD_NUMBER = 2;
        private java.lang.Object from_;
        /**
         * <code>required string from = 2;</code>
         */
        public boolean hasFrom() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required string from = 2;</code>
         */
        public java.lang.String getFrom() {
            java.lang.Object ref = from_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    from_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string from = 2;</code>
         */
        public com.google.protobuf.ByteString
        getFromBytes() {
            java.lang.Object ref = from_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                from_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];
        public static final int TYPE_FIELD_NUMBER = 3;
        private com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType type_;
        /**
         * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
         */
        public com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType getType() {
            return type_;
        }

        // optional string data = 4;
        public static final int DATA_FIELD_NUMBER = 4;
        private java.lang.Object data_;
        /**
         * <code>optional string data = 4;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string data = 4;</code>
         */
        public java.lang.String getData() {
            java.lang.Object ref = data_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    data_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string data = 4;</code>
         */
        public com.google.protobuf.ByteString
        getDataBytes() {
            java.lang.Object ref = data_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required int32 timestamp = 5;
        public static final int TIMESTAMP_FIELD_NUMBER = 5;
        private int timestamp_;
        /**
         * <code>required int32 timestamp = 5;</code>
         */
        public boolean hasTimestamp() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>required int32 timestamp = 5;</code>
         */
        public int getTimestamp() {
            return timestamp_;
        }

        private void initFields() {
            to_ = "";
            from_ = "";
            type_ = com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType.CHAT;
            data_ = "";
            timestamp_ = 0;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasTo()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFrom()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasType()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasTimestamp()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getToBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getFromBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeEnum(3, type_.getNumber());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getDataBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeInt32(5, timestamp_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getToBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getFromBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(3, type_.getNumber());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getDataBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(5, timestamp_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code com.example.cs217b.ndn_hangman.ChatMessage}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.cs217b.ndn_hangman.ChatbufProto.internal_static_net_named_data_jndn_tests_ChatMessage_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.cs217b.ndn_hangman.ChatbufProto.internal_static_net_named_data_jndn_tests_ChatMessage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.class, com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.Builder.class);
            }

            // Construct using com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                to_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                from_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                type_ = com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType.CHAT;
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                timestamp_ = 0;
                bitField0_ = (bitField0_ & ~0x00000010);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.cs217b.ndn_hangman.ChatbufProto.internal_static_net_named_data_jndn_tests_ChatMessage_descriptor;
            }

            public com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage getDefaultInstanceForType() {
                return com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.getDefaultInstance();
            }

            public com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage build() {
                com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage buildPartial() {
                com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage result = new com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.to_ = to_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.from_ = from_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.data_ = data_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.timestamp_ = timestamp_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage) {
                    return mergeFrom((com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage other) {
                if (other == com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.getDefaultInstance()) return this;
                if (other.hasTo()) {
                    bitField0_ |= 0x00000001;
                    to_ = other.to_;
                    onChanged();
                }
                if (other.hasFrom()) {
                    bitField0_ |= 0x00000002;
                    from_ = other.from_;
                    onChanged();
                }
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasData()) {
                    bitField0_ |= 0x00000008;
                    data_ = other.data_;
                    onChanged();
                }
                if (other.hasTimestamp()) {
                    setTimestamp(other.getTimestamp());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasTo()) {

                    return false;
                }
                if (!hasFrom()) {

                    return false;
                }
                if (!hasType()) {

                    return false;
                }
                if (!hasTimestamp()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required string to = 1;
            private java.lang.Object to_ = "";
            /**
             * <code>required string to = 1;</code>
             */
            public boolean hasTo() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string to = 1;</code>
             */
            public java.lang.String getTo() {
                java.lang.Object ref = to_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    to_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string to = 1;</code>
             */
            public com.google.protobuf.ByteString
            getToBytes() {
                java.lang.Object ref = to_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    to_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string to = 1;</code>
             */
            public Builder setTo(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                to_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string to = 1;</code>
             */
            public Builder clearTo() {
                bitField0_ = (bitField0_ & ~0x00000001);
                to_ = getDefaultInstance().getTo();
                onChanged();
                return this;
            }
            /**
             * <code>required string to = 1;</code>
             */
            public Builder setToBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                to_ = value;
                onChanged();
                return this;
            }

            // required string from = 2;
            private java.lang.Object from_ = "";
            /**
             * <code>required string from = 2;</code>
             */
            public boolean hasFrom() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string from = 2;</code>
             */
            public java.lang.String getFrom() {
                java.lang.Object ref = from_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    from_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string from = 2;</code>
             */
            public com.google.protobuf.ByteString
            getFromBytes() {
                java.lang.Object ref = from_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    from_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string from = 2;</code>
             */
            public Builder setFrom(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                from_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string from = 2;</code>
             */
            public Builder clearFrom() {
                bitField0_ = (bitField0_ & ~0x00000002);
                from_ = getDefaultInstance().getFrom();
                onChanged();
                return this;
            }
            /**
             * <code>required string from = 2;</code>
             */
            public Builder setFromBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                from_ = value;
                onChanged();
                return this;
            }

            // required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];
            private com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType type_ = com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType.CHAT;
            /**
             * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
             */
            public boolean hasType() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
             */
            public com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType getType() {
                return type_;
            }
            /**
             * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
             */
            public Builder setType(com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required .com.example.cs217b.ndn_hangman.ChatMessage.ChatMessageType type = 3 [default = CHAT];</code>
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000004);
                type_ = com.example.cs217b.ndn_hangman.ChatbufProto.ChatMessage.ChatMessageType.CHAT;
                onChanged();
                return this;
            }

            // optional string data = 4;
            private java.lang.Object data_ = "";
            /**
             * <code>optional string data = 4;</code>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional string data = 4;</code>
             */
            public java.lang.String getData() {
                java.lang.Object ref = data_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string data = 4;</code>
             */
            public com.google.protobuf.ByteString
            getDataBytes() {
                java.lang.Object ref = data_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    data_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string data = 4;</code>
             */
            public Builder setData(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string data = 4;</code>
             */
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000008);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }
            /**
             * <code>optional string data = 4;</code>
             */
            public Builder setDataBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
                return this;
            }

            // required int32 timestamp = 5;
            private int timestamp_ ;
            /**
             * <code>required int32 timestamp = 5;</code>
             */
            public boolean hasTimestamp() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>required int32 timestamp = 5;</code>
             */
            public int getTimestamp() {
                return timestamp_;
            }
            /**
             * <code>required int32 timestamp = 5;</code>
             */
            public Builder setTimestamp(int value) {
                bitField0_ |= 0x00000010;
                timestamp_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 timestamp = 5;</code>
             */
            public Builder clearTimestamp() {
                bitField0_ = (bitField0_ & ~0x00000010);
                timestamp_ = 0;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:com.example.cs217b.ndn_hangman.ChatMessage)
        }

        static {
            defaultInstance = new ChatMessage(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:com.example.cs217b.ndn_hangman.ChatMessage)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_net_named_data_jndn_tests_ChatMessage_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_net_named_data_jndn_tests_ChatMessage_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\023chatbuf-proto.proto\022\031net.named_data.jn" +
                        "dn.tests\"\334\001\n\013ChatMessage\022\n\n\002to\030\001 \002(\t\022\014\n\004" +
                        "from\030\002 \002(\t\022J\n\004type\030\003 \002(\01626.net.named_dat" +
                        "a.jndn.tests.ChatMessage.ChatMessageType" +
                        ":\004CHAT\022\014\n\004data\030\004 \001(\t\022\021\n\ttimestamp\030\005 \002(\005\"" +
                        "F\n\017ChatMessageType\022\010\n\004CHAT\020\000\022\t\n\005HELLO\020\001\022" +
                        "\t\n\005LEAVE\020\002\022\010\n\004JOIN\020\003\022\t\n\005OTHER\020\004"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_net_named_data_jndn_tests_ChatMessage_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_net_named_data_jndn_tests_ChatMessage_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_net_named_data_jndn_tests_ChatMessage_descriptor,
                                new java.lang.String[] { "To", "From", "Type", "Data", "Timestamp", });
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}