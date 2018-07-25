package io.condorlabs.lgoyes.domain.interactors

import io.condorlabs.lgoyes.domain.THE_MOVIE_DATABASE_API_KEY
import io.condorlabs.lgoyes.domain.interactors.base.ObservableUseCase
import io.condorlabs.lgoyes.domain.repositories.IWebRepository
import io.reactivex.Observable
import io.reactivex.Scheduler

/**
 * @author Luis Goyes (lgoyes@condorlabs.io) on July/25/2018
 */
class ObtainMovieTrailerInteractor (mSubscribeOnScheduler: Scheduler,
                                   mObserveOnScheduler: Scheduler,
                                   private val mWebServiceRepository: IWebRepository) :
        ObservableUseCase<String?, String>(mSubscribeOnScheduler, mObserveOnScheduler) {
    override fun buildUseCase(params: String): Observable<String?> =
            mWebServiceRepository.getMovieTrailer(params, THE_MOVIE_DATABASE_API_KEY)
}
