package com.tapaafandi.dicoflix.utils

import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.domain.model.TvShow

object DataDummy {

    fun generateDummyMovies(): List<Movie> {

        val movies = ArrayList<Movie>()

        movies.add(
            Movie(
                1,
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "31 March 2021",
                R.drawable.poster_godzilla_vs_kong,
                "Action, Sci-Fi, Thriller",
                "Adam Wingard"
            )
        )
        movies.add(
            Movie(
                2,
                "The Little Things",
                "Deputy Sheriff Joe \"Deke\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",
                "29 January 2021",
                R.drawable.poster_the_little_things,
                "Thriller, Crime",
                "John Lee Hancock"
            )
        )
        movies.add(
            Movie(
                3,
                "The White Tiger",
                "An ambitious Indian driver uses his wit and cunning to escape from poverty and rise to the top. An epic journey based on the New York Times bestseller.",
                "22 January 2021",
                R.drawable.poster_the_white_tiger,
                "Crime, Drama",
                "Ramin Bahrani"
            )
        )
        movies.add(
            Movie(
                4,
                "The Dig",
                "As WWII looms, a wealthy widow hires an amateur archaeologist to excavate the burial mounds on her estate. When they make a historic discovery, the echoes of Britain's past resonate in the face of its uncertain future.",
                "29 January 2021",
                R.drawable.poster_the_dig,
                "Drama, History",
                "Simon Stone"
            )
        )
        movies.add(
            Movie(
                5,
                "Soul",
                "After landing the gig of a lifetime, a New York jazz pianist suddenly finds himself trapped in a strange land between Earth and the afterlife.",
                "25 December 2020",
                R.drawable.poster_soul,
                "Animation, Adventure, Comedy",
                "Pete Docter"
            )
        )
        movies.add(
            Movie(
                6,
                "Tenet",
                "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                "3 September 2020",
                R.drawable.poster_tenet,
                "Action, Thriller, Science Fiction",
                "Christopher Nolan"
            )
        )
        movies.add(
            Movie(
                7,
                "Palmer",
                "After 12 years in prison, former high school football star Eddie Palmer returns home to put his life back together—and forms an unlikely bond with Sam, an outcast boy from a troubled home. But Eddie's past threatens to ruin his new life and family.",
                "29 January 2021",
                R.drawable.poster_palmer,
                "Drama",
                "Fisher Stevens"
            )
        )
        movies.add(
            Movie(
                8,
                "The Vanished",
                "Story of a husband and wife that will stop at nothing to find their missing daughter, who disappeared on a family camping trip. When the police don't catch any leads, the duo take over.",
                "21 August 2020",
                R.drawable.poster_the_vanished,
                "Action, Mystery, Thriller",
                "Peter Facinelli"
            )
        )
        movies.add(
            Movie(
                9,
                "Outside the Wire",
                "In the near future, a drone pilot sent into a war zone finds himself paired with a top-secret android officer on a mission to stop a nuclear attack.",
                "15 January 2021",
                R.drawable.poster_outside_the_wire,
                "Thriller, Action, Science Fiction",
                "Mikael Håfström"
            )
        )
        movies.add(
            Movie(
                10,
                "One Night in Miami",
                "In the aftermath of Cassius Clay's defeat of Sonny Liston in 1964, the boxer meets with Malcolm X, Sam Cooke and Jim Brown to change the course of history in the segregated South.",
                "8 January 2021",
                R.drawable.poster_one_night_in_miami,
                "Drama",
                "Regina King"
            )
        )
        return movies
    }

    fun generateTvShows(): List<TvShow> {

        val tvShows = ArrayList<TvShow>()

        tvShows.add(
            TvShow(
                1,
                "WandaVision",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                "2021",
                R.drawable.poster_wandavision,
                "Sci-Fi & Fantasy, Mystery, Comedy, Drama",
                "Jac Schaeffer"
            )
        )
        tvShows.add(
            TvShow(
                2,
                "Fate: The Winx Saga",
                "The coming-of-age journey of five fairies attending Alfea, a magical boarding school in the Otherworld where they must learn to master their powers while navigating love, rivalries, and the monsters that threaten their very existence.",
                "2021",
                R.drawable.poster_fate_the_winx_saga,
                "Action, Adventure, Drama",
                "Brian Young"
            )
        )
        tvShows.add(
            TvShow(
                3,
                "Bridgerton",
                "Wealth, lust, and betrayal set against the backdrop of Regency-era England, seen through the eyes of the powerful Bridgerton family.",
                "2020",
                R.drawable.poster_bridgerton,
                "Drama",
                "Chris Van Dusen"
            )
        )
        tvShows.add(
            TvShow(
                4,
                "Lupin",
                "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                "2021",
                R.drawable.poster_lupin,
                "Crime, Drama, Mystery",
                "George Kay"
            )
        )
        tvShows.add(
            TvShow(
                5,
                "The Queen's Gambit",
                "Orphaned at the tender age of nine, prodigious introvert Beth Harmon discovers and masters the game of chess in 1960s USA. But child stardom comes at a price.",
                "2020",
                R.drawable.poster_the_queens_gambit,
                "Drama, Sport",
                "Scott Frank, Allan Scott"
            )
        )
        tvShows.add(
            TvShow(
                6,
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                R.drawable.poster_riverdale,
                "Mystery, Drama, Crime",
                "Roberto Aguirre-Sacasa"
            )
        )
        tvShows.add(
            TvShow(
                7,
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011",
                R.drawable.poster_got,
                "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery, War & Politics",
                "David Benioff, D. B. Weiss"
            )
        )
        tvShows.add(
            TvShow(
                8,
                "The Umbrella Academy",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "2019",
                R.drawable.poster_the_umbrella_academy,
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "Steve Blackman"
            )
        )
        tvShows.add(
            TvShow(
                9,
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                R.drawable.poster_lucifer,
                "Crime, Sci-Fi & Fantasy",
                "Tom Kapinos"
            )
        )
        tvShows.add(
            TvShow(
                10,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                R.drawable.poster_the_flash,
                "Drama, Sci-Fi & Fantasy",
                "Greg Berlanti, Geoff Johns, Andrew Kreisberg"
            )
        )

        return tvShows
    }
}