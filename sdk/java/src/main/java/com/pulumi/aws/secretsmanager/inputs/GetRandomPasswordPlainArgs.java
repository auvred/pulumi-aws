// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRandomPasswordPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRandomPasswordPlainArgs Empty = new GetRandomPasswordPlainArgs();

    /**
     * String of the characters that you don&#39;t want in the password.
     * 
     */
    @Import(name="excludeCharacters")
    private @Nullable String excludeCharacters;

    /**
     * @return String of the characters that you don&#39;t want in the password.
     * 
     */
    public Optional<String> excludeCharacters() {
        return Optional.ofNullable(this.excludeCharacters);
    }

    /**
     * Specifies whether to exclude lowercase letters from the password.
     * 
     */
    @Import(name="excludeLowercase")
    private @Nullable Boolean excludeLowercase;

    /**
     * @return Specifies whether to exclude lowercase letters from the password.
     * 
     */
    public Optional<Boolean> excludeLowercase() {
        return Optional.ofNullable(this.excludeLowercase);
    }

    /**
     * Specifies whether to exclude numbers from the password.
     * 
     */
    @Import(name="excludeNumbers")
    private @Nullable Boolean excludeNumbers;

    /**
     * @return Specifies whether to exclude numbers from the password.
     * 
     */
    public Optional<Boolean> excludeNumbers() {
        return Optional.ofNullable(this.excludeNumbers);
    }

    /**
     * Specifies whether to exclude the following punctuation characters from the password: ``! &#34; # $ %!&amp;(MISSING) &#39; ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~ .``
     * 
     */
    @Import(name="excludePunctuation")
    private @Nullable Boolean excludePunctuation;

    /**
     * @return Specifies whether to exclude the following punctuation characters from the password: ``! &#34; # $ %!&amp;(MISSING) &#39; ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~ .``
     * 
     */
    public Optional<Boolean> excludePunctuation() {
        return Optional.ofNullable(this.excludePunctuation);
    }

    /**
     * Specifies whether to exclude uppercase letters from the password.
     * 
     */
    @Import(name="excludeUppercase")
    private @Nullable Boolean excludeUppercase;

    /**
     * @return Specifies whether to exclude uppercase letters from the password.
     * 
     */
    public Optional<Boolean> excludeUppercase() {
        return Optional.ofNullable(this.excludeUppercase);
    }

    /**
     * Specifies whether to include the space character.
     * 
     */
    @Import(name="includeSpace")
    private @Nullable Boolean includeSpace;

    /**
     * @return Specifies whether to include the space character.
     * 
     */
    public Optional<Boolean> includeSpace() {
        return Optional.ofNullable(this.includeSpace);
    }

    /**
     * Length of the password.
     * 
     */
    @Import(name="passwordLength")
    private @Nullable Integer passwordLength;

    /**
     * @return Length of the password.
     * 
     */
    public Optional<Integer> passwordLength() {
        return Optional.ofNullable(this.passwordLength);
    }

    /**
     * Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
     * 
     */
    @Import(name="requireEachIncludedType")
    private @Nullable Boolean requireEachIncludedType;

    /**
     * @return Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
     * 
     */
    public Optional<Boolean> requireEachIncludedType() {
        return Optional.ofNullable(this.requireEachIncludedType);
    }

    private GetRandomPasswordPlainArgs() {}

    private GetRandomPasswordPlainArgs(GetRandomPasswordPlainArgs $) {
        this.excludeCharacters = $.excludeCharacters;
        this.excludeLowercase = $.excludeLowercase;
        this.excludeNumbers = $.excludeNumbers;
        this.excludePunctuation = $.excludePunctuation;
        this.excludeUppercase = $.excludeUppercase;
        this.includeSpace = $.includeSpace;
        this.passwordLength = $.passwordLength;
        this.requireEachIncludedType = $.requireEachIncludedType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRandomPasswordPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRandomPasswordPlainArgs $;

        public Builder() {
            $ = new GetRandomPasswordPlainArgs();
        }

        public Builder(GetRandomPasswordPlainArgs defaults) {
            $ = new GetRandomPasswordPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeCharacters String of the characters that you don&#39;t want in the password.
         * 
         * @return builder
         * 
         */
        public Builder excludeCharacters(@Nullable String excludeCharacters) {
            $.excludeCharacters = excludeCharacters;
            return this;
        }

        /**
         * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
         * 
         * @return builder
         * 
         */
        public Builder excludeLowercase(@Nullable Boolean excludeLowercase) {
            $.excludeLowercase = excludeLowercase;
            return this;
        }

        /**
         * @param excludeNumbers Specifies whether to exclude numbers from the password.
         * 
         * @return builder
         * 
         */
        public Builder excludeNumbers(@Nullable Boolean excludeNumbers) {
            $.excludeNumbers = excludeNumbers;
            return this;
        }

        /**
         * @param excludePunctuation Specifies whether to exclude the following punctuation characters from the password: ``! &#34; # $ %!&amp;(MISSING) &#39; ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~ .``
         * 
         * @return builder
         * 
         */
        public Builder excludePunctuation(@Nullable Boolean excludePunctuation) {
            $.excludePunctuation = excludePunctuation;
            return this;
        }

        /**
         * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
         * 
         * @return builder
         * 
         */
        public Builder excludeUppercase(@Nullable Boolean excludeUppercase) {
            $.excludeUppercase = excludeUppercase;
            return this;
        }

        /**
         * @param includeSpace Specifies whether to include the space character.
         * 
         * @return builder
         * 
         */
        public Builder includeSpace(@Nullable Boolean includeSpace) {
            $.includeSpace = includeSpace;
            return this;
        }

        /**
         * @param passwordLength Length of the password.
         * 
         * @return builder
         * 
         */
        public Builder passwordLength(@Nullable Integer passwordLength) {
            $.passwordLength = passwordLength;
            return this;
        }

        /**
         * @param requireEachIncludedType Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
         * 
         * @return builder
         * 
         */
        public Builder requireEachIncludedType(@Nullable Boolean requireEachIncludedType) {
            $.requireEachIncludedType = requireEachIncludedType;
            return this;
        }

        public GetRandomPasswordPlainArgs build() {
            return $;
        }
    }

}
