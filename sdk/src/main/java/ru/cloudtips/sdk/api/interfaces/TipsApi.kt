package ru.cloudtips.sdk.api.interfaces

import io.reactivex.Single
import retrofit2.http.*
import ru.cloudtips.sdk.api.models.*

interface TipsApi {

    @GET("layouts/list/{phoneNumber}")
    fun getLayout(@Path("phoneNumber") phoneNumber: String): Single<ArrayList<Layout>>

    @POST("auth/offlineregister")
    fun offlineRegister(@Body body: OfflineRegisterRequestBody): Single<ArrayList<Layout>>

    @GET("user/public/{layoutId}")
    fun getUser(@Path("layoutId") layoutId: String): Single<Profile>

    @GET("paymentpages/{layoutId}")
    fun getPaymentPage(@Path("layoutId") layoutId: String): Single<PaymentPage>

    @POST("payment/publicId")
    fun getPublicId(@Body body: GetPublicIdRequestBody): Single<PublicId>

    @POST("captcha/verify")
    fun verify(@Body body: VerifyRequestBody): Single<VerifyResponse>

    @POST("payment/auth")
    fun auth(@Body body: PaymentRequestBody): Single<PaymentResponse>

    @POST("payment/post3ds")
    fun postThreeDs(@Body body: PostThreeDsRequestBody): Single<PaymentResponse>
}

