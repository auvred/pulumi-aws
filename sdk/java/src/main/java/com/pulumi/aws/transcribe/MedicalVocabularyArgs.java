// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transcribe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MedicalVocabularyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MedicalVocabularyArgs Empty = new MedicalVocabularyArgs();

    /**
     * The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     * 
     */
    @Import(name="languageCode", required=true)
    private Output<String> languageCode;

    /**
     * @return The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }

    /**
     * A map of tags to assign to the MedicalVocabulary. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the MedicalVocabulary. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     * 
     */
    @Import(name="vocabularyFileUri", required=true)
    private Output<String> vocabularyFileUri;

    /**
     * @return The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     * 
     */
    public Output<String> vocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * The name of the Medical Vocabulary.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="vocabularyName", required=true)
    private Output<String> vocabularyName;

    /**
     * @return The name of the Medical Vocabulary.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> vocabularyName() {
        return this.vocabularyName;
    }

    private MedicalVocabularyArgs() {}

    private MedicalVocabularyArgs(MedicalVocabularyArgs $) {
        this.languageCode = $.languageCode;
        this.tags = $.tags;
        this.vocabularyFileUri = $.vocabularyFileUri;
        this.vocabularyName = $.vocabularyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MedicalVocabularyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MedicalVocabularyArgs $;

        public Builder() {
            $ = new MedicalVocabularyArgs();
        }

        public Builder(MedicalVocabularyArgs defaults) {
            $ = new MedicalVocabularyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param languageCode The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param tags A map of tags to assign to the MedicalVocabulary. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the MedicalVocabulary. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vocabularyFileUri The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
         * 
         * @return builder
         * 
         */
        public Builder vocabularyFileUri(Output<String> vocabularyFileUri) {
            $.vocabularyFileUri = vocabularyFileUri;
            return this;
        }

        /**
         * @param vocabularyFileUri The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
         * 
         * @return builder
         * 
         */
        public Builder vocabularyFileUri(String vocabularyFileUri) {
            return vocabularyFileUri(Output.of(vocabularyFileUri));
        }

        /**
         * @param vocabularyName The name of the Medical Vocabulary.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder vocabularyName(Output<String> vocabularyName) {
            $.vocabularyName = vocabularyName;
            return this;
        }

        /**
         * @param vocabularyName The name of the Medical Vocabulary.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder vocabularyName(String vocabularyName) {
            return vocabularyName(Output.of(vocabularyName));
        }

        public MedicalVocabularyArgs build() {
            if ($.languageCode == null) {
                throw new MissingRequiredPropertyException("MedicalVocabularyArgs", "languageCode");
            }
            if ($.vocabularyFileUri == null) {
                throw new MissingRequiredPropertyException("MedicalVocabularyArgs", "vocabularyFileUri");
            }
            if ($.vocabularyName == null) {
                throw new MissingRequiredPropertyException("MedicalVocabularyArgs", "vocabularyName");
            }
            return $;
        }
    }

}
