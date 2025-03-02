// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryEndpointPlainArgs Empty = new GetRepositoryEndpointPlainArgs();

    /**
     * Name of the domain that contains the repository.
     * 
     */
    @Import(name="domain", required=true)
    private String domain;

    /**
     * @return Name of the domain that contains the repository.
     * 
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable String domainOwner;

    /**
     * @return Account number of the AWS account that owns the domain.
     * 
     */
    public Optional<String> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
     * 
     */
    @Import(name="format", required=true)
    private String format;

    /**
     * @return Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
     * 
     */
    public String format() {
        return this.format;
    }

    /**
     * Name of the repository.
     * 
     */
    @Import(name="repository", required=true)
    private String repository;

    /**
     * @return Name of the repository.
     * 
     */
    public String repository() {
        return this.repository;
    }

    private GetRepositoryEndpointPlainArgs() {}

    private GetRepositoryEndpointPlainArgs(GetRepositoryEndpointPlainArgs $) {
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.format = $.format;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryEndpointPlainArgs $;

        public Builder() {
            $ = new GetRepositoryEndpointPlainArgs();
        }

        public Builder(GetRepositoryEndpointPlainArgs defaults) {
            $ = new GetRepositoryEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain Name of the domain that contains the repository.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domainOwner Account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(@Nullable String domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        /**
         * @param format Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            $.format = format;
            return this;
        }

        /**
         * @param repository Name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            $.repository = repository;
            return this;
        }

        public GetRepositoryEndpointPlainArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("GetRepositoryEndpointPlainArgs", "domain");
            }
            if ($.format == null) {
                throw new MissingRequiredPropertyException("GetRepositoryEndpointPlainArgs", "format");
            }
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("GetRepositoryEndpointPlainArgs", "repository");
            }
            return $;
        }
    }

}
