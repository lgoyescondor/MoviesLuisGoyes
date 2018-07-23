package io.condorlabs.lgoyes.domain.repositories

import io.condorlabs.lgoyes.domain.WEB_REPOSITORY_DEFAULT_LANGUAGE
import io.condorlabs.lgoyes.domain.WEB_REPOSITORY_DEFAULT_PAGE
import io.condorlabs.lgoyes.domain.models.Movie
import io.condorlabs.lgoyes.domain.models.MovieDetail
import io.reactivex.Observable

/**
 * @author Luis Goyes (lgoyes@condorlabs.io) on July/23/2018
 */
interface IWebRepository {

    fun getListPopularMovies(apiKey: String,
                             language: String = WEB_REPOSITORY_DEFAULT_LANGUAGE,
                             page: String = WEB_REPOSITORY_DEFAULT_PAGE): Observable<List<Movie>>

    fun getMovieDetails(movieId: String,
                        apiKey: String,
                        language: String = WEB_REPOSITORY_DEFAULT_LANGUAGE): Observable<MovieDetail>
}