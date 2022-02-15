package io.github.liuziyuan.retrofit.extension;

import okhttp3.OkHttpClient;

/**
 * Abstract class of OkHttpClient Builder, the custom OkHttpClient need to inherit it
 * @author liuziyuan
 */
public abstract class BaseOkHttpClientBuilder extends BaseBuilder<OkHttpClient.Builder> {

    /**
     * provide OkHttpClient.Builder to complete the OkHttpClient creation
     *
     * @param builder OkHttpClient.Builder
     * @return OkHttpClient.Builder
     */
    public abstract OkHttpClient.Builder builder(OkHttpClient.Builder builder);

    @Override
    public final OkHttpClient.Builder executeBuild() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        return builder(okHttpClientBuilder);
    }


}
