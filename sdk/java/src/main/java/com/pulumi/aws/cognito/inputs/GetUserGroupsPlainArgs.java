// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.GetUserGroupsGroup;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserGroupsPlainArgs Empty = new GetUserGroupsPlainArgs();

    /**
     * List of groups. See `groups` below.
     * 
     */
    @Import(name="groups")
    private @Nullable List<GetUserGroupsGroup> groups;

    /**
     * @return List of groups. See `groups` below.
     * 
     */
    public Optional<List<GetUserGroupsGroup>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * User pool the client belongs to.
     * 
     */
    @Import(name="userPoolId", required=true)
    private String userPoolId;

    /**
     * @return User pool the client belongs to.
     * 
     */
    public String userPoolId() {
        return this.userPoolId;
    }

    private GetUserGroupsPlainArgs() {}

    private GetUserGroupsPlainArgs(GetUserGroupsPlainArgs $) {
        this.groups = $.groups;
        this.userPoolId = $.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserGroupsPlainArgs $;

        public Builder() {
            $ = new GetUserGroupsPlainArgs();
        }

        public Builder(GetUserGroupsPlainArgs defaults) {
            $ = new GetUserGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groups List of groups. See `groups` below.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable List<GetUserGroupsGroup> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups List of groups. See `groups` below.
         * 
         * @return builder
         * 
         */
        public Builder groups(GetUserGroupsGroup... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param userPoolId User pool the client belongs to.
         * 
         * @return builder
         * 
         */
        public Builder userPoolId(String userPoolId) {
            $.userPoolId = userPoolId;
            return this;
        }

        public GetUserGroupsPlainArgs build() {
            if ($.userPoolId == null) {
                throw new MissingRequiredPropertyException("GetUserGroupsPlainArgs", "userPoolId");
            }
            return $;
        }
    }

}
