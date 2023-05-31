package com.github.rasskazovalexey.sanction.data.model

/**
 * Data errors like 404, 500, generis error response like no auth. For challenge only [Generic] is
 * used, no need to over complicate. This shall be sealed interface as in real world we need more
 * and they might be grouped in better way with sealed interface vs sealed class.
 */
sealed interface DataError {

    /**
     * The only available error for challenge.
     */
    object Generic : DataError
}
