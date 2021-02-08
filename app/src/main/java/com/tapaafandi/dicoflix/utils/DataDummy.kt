package com.tapaafandi.dicoflix.utils

import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.data.source.remote.response.MovieResponse
import com.tapaafandi.dicoflix.data.source.remote.response.TvShowResponse
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.domain.model.TvShow

object DataDummy {

    fun generateDummyMovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                1,
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "31 March 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3Iso4hatk3N0RTkQFAk7YFO4GGy.jpg",
                "Action, Sci-Fi, Thriller",
                "Adam Wingard"
            )
        )
        movies.add(
            MovieEntity(
                2,
                "The Little Things",
                "Deputy Sheriff Joe \"Deke\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",
                "29 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/c7VlGCCgM9GZivKSzBgzuOVxQn7.jpg",
                "Thriller, Crime",
                "John Lee Hancock"
            )
        )
        movies.add(
            MovieEntity(
                3,
                "The White Tiger",
                "An ambitious Indian driver uses his wit and cunning to escape from poverty and rise to the top. An epic journey based on the New York Times bestseller.",
                "22 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7K4mdWaLGF2F4ASb2L12tlya9c9.jpg",
                "Crime, Drama",
                "Ramin Bahrani"
            )
        )
        movies.add(
            MovieEntity(
                4,
                "The Dig",
                "As WWII looms, a wealthy widow hires an amateur archaeologist to excavate the burial mounds on her estate. When they make a historic discovery, the echoes of Britain's past resonate in the face of its uncertain future.",
                "29 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dFDNb9Gk1kyLRcconpj7Mc7C7IL.jpg",
                "Drama, History",
                "Simon Stone"
            )
        )
        movies.add(
            MovieEntity(
                5,
                "Soul",
                "After landing the gig of a lifetime, a New York jazz pianist suddenly finds himself trapped in a strange land between Earth and the afterlife.",
                "25 December 2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg",
                "Animation, Adventure, Comedy",
                "Pete Docter"
            )
        )
        movies.add(
            MovieEntity(
                6,
                "Tenet",
                "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                "3 September 2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/k68nPLbIST6NP96JmTxmZijEvCA.jpgt",
                "Action, Thriller, Science Fiction",
                "Christopher Nolan"
            )
        )
        movies.add(
            MovieEntity(
                7,
                "Palmer",
                "After 12 years in prison, former high school football star Eddie Palmer returns home to put his life back together—and forms an unlikely bond with Sam, an outcast boy from a troubled home. But Eddie's past threatens to ruin his new life and family.",
                "29 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xSDdRAjxKAGi8fUBLOqSrBhJmF0.jpg",
                "Drama",
                "Fisher Stevens"
            )
        )
        movies.add(
            MovieEntity(
                8,
                "The Vanished",
                "Story of a husband and wife that will stop at nothing to find their missing daughter, who disappeared on a family camping trip. When the police don't catch any leads, the duo take over.",
                "21 August 2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bYePSWEmMw9PQ9hNwMzgW1rQUtI.jpg",
                "Action, Mystery, Thriller",
                "Peter Facinelli"
            )
        )
        movies.add(
            MovieEntity(
                9,
                "Outside the Wire",
                "In the near future, a drone pilot sent into a war zone finds himself paired with a top-secret android officer on a mission to stop a nuclear attack.",
                "15 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6XYLiMxHAaCsoyrVo38LBWMw2p8.jpg",
                "Thriller, Action, Science Fiction",
                "Mikael Håfström"
            )
        )
        movies.add(
            MovieEntity(
                10,
                "One Night in Miami",
                "In the aftermath of Cassius Clay's defeat of Sonny Liston in 1964, the boxer meets with Malcolm X, Sam Cooke and Jim Brown to change the course of history in the segregated South.",
                "8 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rfIOzedY6LFzdWTeNnIkmxAiLCg.jpg",
                "Drama",
                "Regina King"
            )
        )
        return movies
    }

    fun generateTvShows(): List<TvShowEntity> {

        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                1,
                "WandaVision",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                "Sci-Fi & Fantasy, Mystery, Comedy, Drama",
                "Jac Schaeffer"
            )
        )
        tvShows.add(
            TvShowEntity(
                2,
                "Fate: The Winx Saga",
                "The coming-of-age journey of five fairies attending Alfea, a magical boarding school in the Otherworld where they must learn to master their powers while navigating love, rivalries, and the monsters that threaten their very existence.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oHj6guMrLfQcBzo3uxwBJc8Y736.jpg",
                "Action, Adventure, Drama",
                "Brian Young"
            )
        )
        tvShows.add(
            TvShowEntity(
                3,
                "Bridgerton",
                "Wealth, lust, and betrayal set against the backdrop of Regency-era England, seen through the eyes of the powerful Bridgerton family.",
                "2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qaewZKBKmXjb4ZfFBb1LCug6BE8.jpg",
                "Drama",
                "Chris Van Dusen"
            )
        )
        tvShows.add(
            TvShowEntity(
                4,
                "Lupin",
                "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/sgxawbFB5Vi5OkPWQLNfl3dvkNJ.jpg",
                "Crime, Drama, Mystery",
                "George Kay"
            )
        )
        tvShows.add(
            TvShowEntity(
                5,
                "The Queen's Gambit",
                "Orphaned at the tender age of nine, prodigious introvert Beth Harmon discovers and masters the game of chess in 1960s USA. But child stardom comes at a price.",
                "2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                "Drama, Sport",
                "Scott Frank, Allan Scott"
            )
        )
        tvShows.add(
            TvShowEntity(
                6,
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                "Mystery, Drama, Crime",
                "Roberto Aguirre-Sacasa"
            )
        )
        tvShows.add(
            TvShowEntity(
                7,
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery, War & Politics",
                "David Benioff, D. B. Weiss"
            )
        )
        tvShows.add(
            TvShowEntity(
                8,
                "The Umbrella Academy",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "2019",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "Steve Blackman"
            )
        )
        tvShows.add(
            TvShowEntity(
                9,
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "Crime, Sci-Fi & Fantasy",
                "Tom Kapinos"
            )
        )
        tvShows.add(
            TvShowEntity(
                10,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                "Drama, Sci-Fi & Fantasy",
                "Greg Berlanti, Geoff Johns, Andrew Kreisberg"
            )
        )

        return tvShows
    }


    fun generateRemoteDummyMovies(): ArrayList<MovieResponse> {

        val movies = ArrayList<MovieResponse>()

        movies.add(
            MovieResponse(
                1,
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "31 March 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3Iso4hatk3N0RTkQFAk7YFO4GGy.jpg",
                "Action, Sci-Fi, Thriller",
                "Adam Wingard"
            )
        )
        movies.add(
            MovieResponse(
                2,
                "The Little Things",
                "Deputy Sheriff Joe \"Deke\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",
                "29 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/c7VlGCCgM9GZivKSzBgzuOVxQn7.jpg",
                "Thriller, Crime",
                "John Lee Hancock"
            )
        )
        movies.add(
            MovieResponse(
                3,
                "The White Tiger",
                "An ambitious Indian driver uses his wit and cunning to escape from poverty and rise to the top. An epic journey based on the New York Times bestseller.",
                "22 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7K4mdWaLGF2F4ASb2L12tlya9c9.jpg",
                "Crime, Drama",
                "Ramin Bahrani"
            )
        )
        movies.add(
            MovieResponse(
                4,
                "The Dig",
                "As WWII looms, a wealthy widow hires an amateur archaeologist to excavate the burial mounds on her estate. When they make a historic discovery, the echoes of Britain's past resonate in the face of its uncertain future.",
                "29 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dFDNb9Gk1kyLRcconpj7Mc7C7IL.jpg",
                "Drama, History",
                "Simon Stone"
            )
        )
        movies.add(
            MovieResponse(
                5,
                "Soul",
                "After landing the gig of a lifetime, a New York jazz pianist suddenly finds himself trapped in a strange land between Earth and the afterlife.",
                "25 December 2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg",
                "Animation, Adventure, Comedy",
                "Pete Docter"
            )
        )
        movies.add(
            MovieResponse(
                6,
                "Tenet",
                "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                "3 September 2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/k68nPLbIST6NP96JmTxmZijEvCA.jpgt",
                "Action, Thriller, Science Fiction",
                "Christopher Nolan"
            )
        )
        movies.add(
            MovieResponse(
                7,
                "Palmer",
                "After 12 years in prison, former high school football star Eddie Palmer returns home to put his life back together—and forms an unlikely bond with Sam, an outcast boy from a troubled home. But Eddie's past threatens to ruin his new life and family.",
                "29 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xSDdRAjxKAGi8fUBLOqSrBhJmF0.jpg",
                "Drama",
                "Fisher Stevens"
            )
        )
        movies.add(
            MovieResponse(
                8,
                "The Vanished",
                "Story of a husband and wife that will stop at nothing to find their missing daughter, who disappeared on a family camping trip. When the police don't catch any leads, the duo take over.",
                "21 August 2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bYePSWEmMw9PQ9hNwMzgW1rQUtI.jpg",
                "Action, Mystery, Thriller",
                "Peter Facinelli"
            )
        )
        movies.add(
            MovieResponse(
                9,
                "Outside the Wire",
                "In the near future, a drone pilot sent into a war zone finds himself paired with a top-secret android officer on a mission to stop a nuclear attack.",
                "15 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6XYLiMxHAaCsoyrVo38LBWMw2p8.jpg",
                "Thriller, Action, Science Fiction",
                "Mikael Håfström"
            )
        )
        movies.add(
            MovieResponse(
                10,
                "One Night in Miami",
                "In the aftermath of Cassius Clay's defeat of Sonny Liston in 1964, the boxer meets with Malcolm X, Sam Cooke and Jim Brown to change the course of history in the segregated South.",
                "8 January 2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rfIOzedY6LFzdWTeNnIkmxAiLCg.jpg",
                "Drama",
                "Regina King"
            )
        )
        return movies
    }

    fun generateRemoteDummyTvShows(): ArrayList<TvShowResponse> {

        val tvShows = ArrayList<TvShowResponse>()

        tvShows.add(
            TvShowResponse(
                1,
                "WandaVision",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                "Sci-Fi & Fantasy, Mystery, Comedy, Drama",
                "Jac Schaeffer"
            )
        )
        tvShows.add(
            TvShowResponse(
                2,
                "Fate: The Winx Saga",
                "The coming-of-age journey of five fairies attending Alfea, a magical boarding school in the Otherworld where they must learn to master their powers while navigating love, rivalries, and the monsters that threaten their very existence.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oHj6guMrLfQcBzo3uxwBJc8Y736.jpg",
                "Action, Adventure, Drama",
                "Brian Young"
            )
        )
        tvShows.add(
            TvShowResponse(
                3,
                "Bridgerton",
                "Wealth, lust, and betrayal set against the backdrop of Regency-era England, seen through the eyes of the powerful Bridgerton family.",
                "2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qaewZKBKmXjb4ZfFBb1LCug6BE8.jpg",
                "Drama",
                "Chris Van Dusen"
            )
        )
        tvShows.add(
            TvShowResponse(
                4,
                "Lupin",
                "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/sgxawbFB5Vi5OkPWQLNfl3dvkNJ.jpg",
                "Crime, Drama, Mystery",
                "George Kay"
            )
        )
        tvShows.add(
            TvShowResponse(
                5,
                "The Queen's Gambit",
                "Orphaned at the tender age of nine, prodigious introvert Beth Harmon discovers and masters the game of chess in 1960s USA. But child stardom comes at a price.",
                "2020",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                "Drama, Sport",
                "Scott Frank, Allan Scott"
            )
        )
        tvShows.add(
            TvShowResponse(
                6,
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                "Mystery, Drama, Crime",
                "Roberto Aguirre-Sacasa"
            )
        )
        tvShows.add(
            TvShowResponse(
                7,
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery, War & Politics",
                "David Benioff, D. B. Weiss"
            )
        )
        tvShows.add(
            TvShowResponse(
                8,
                "The Umbrella Academy",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "2019",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "Steve Blackman"
            )
        )
        tvShows.add(
            TvShowResponse(
                9,
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "Crime, Sci-Fi & Fantasy",
                "Tom Kapinos"
            )
        )
        tvShows.add(
            TvShowResponse(
                10,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                "Drama, Sci-Fi & Fantasy",
                "Greg Berlanti, Geoff Johns, Andrew Kreisberg"
            )
        )

        return tvShows
    }
}