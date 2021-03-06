object Constants {
    const val projectName = "DiscordKt"
    const val projectDescription = "A Discord bot framework for Kotlin."
    const val projectUrl = "https://github.com/JakeJMattson/$projectName/"
    const val releasesRepoUrl = "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
    const val snapshotsRepoUrl = "https://oss.sonatype.org/content/repositories/snapshots/"
}

object Versions {
    const val kotlin = "1.4.10"
    const val dokka = "1.4.10.2"
    const val coroutines = "1.4.0"
    const val reflections = "0.9.12"
    const val gson = "2.8.6"
    const val slf4j = "2.0.0-alpha1"
    const val kord = "0.6.9"
    const val emojis = "0.4.0"
}

object Dependencies {
    //Internal Dependencies
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val reflections = "org.reflections:reflections:${Versions.reflections}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val slf4j = "org.slf4j:slf4j-nop:${Versions.slf4j}"

    //Library Dependencies
    const val kord = "com.gitlab.kordlib.kord:kord-core:${Versions.kord}"
    const val emojis = "com.gitlab.kordlib:kordx.emoji:${Versions.emojis}"
}

object README {
    private const val kotlin = Versions.kotlin
    private const val kord = Versions.kord
    private const val project = Constants.projectName

    val badges = """
        <p align="center">
            <a href="https://discord.gg/REZVVjA">
                <img alt="Discord Banner" src="https://discordapp.com/api/guilds/453208597082406912/widget.png?style=banner2"/>
            </a>
            <br/>
            <a href="https://kotlinlang.org/">
                <img src="https://img.shields.io/badge/Kotlin-${kotlin}-blue.svg?logo=Kotlin" alt="Kotlin $kotlin">
            </a>
            <a href = "https://github.com/kordlib/kord">            
            <img alt="Kord $kord" src="https://img.shields.io/badge/Kord-${kord}-orange.svg?logo=data:image/png;base64,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">
            </a>
            <a href="https://GitHub.com/JakeJMattson/DiscordKt/releases/">
                <img src="https://img.shields.io/github/release/JakeJMattson/DiscordKt.svg?color=green?label=Release&logo=Github" alt="Release">
            </a>
            <br>
            <a href="https://discordapp.com/users/254786431656919051/">
                <img src="https://img.shields.io/badge/Personal-JakeyWakey%231569-%2300BFFF.svg?logo=discord" alt="Discord JakeyWakey#1569">
            </a>
        </p>
    """.trimIndent()

    fun createImport(group: String, version: String, isSnapshot: Boolean) = buildString {
        val gradleTag = "${group}:${project}:${version}"
        val snapshotUrl = "https://oss.sonatype.org/content/repositories/snapshots/"

        appendln("### Maven\n```xml")

        if (isSnapshot)
            appendln("""
                <repository>
                    <id>Sonatype Snapshots</id>
                    <url>$snapshotUrl</url>
                </repository>
                
            """.trimIndent())

        appendln("""
            <dependency>
                <groupId>${group}</groupId>
                <artifactId>${project}</artifactId>
                <version>${version}</version>
            </dependency>
            ```
        """.trimIndent())

        appendln("### Gradle\n```groovy")

        if (isSnapshot)
            appendln("""
                maven {
                    url '${snapshotUrl}'
                }
                
            """.trimIndent())

        appendln("""
            dependencies {
                implementation '${gradleTag}'
            }
            ```
            ```kotlin
        """.trimIndent())

        if (isSnapshot)
            appendln("""
                maven {
                    url = uri("$snapshotUrl")
                }
                
            """.trimIndent())

        appendln("""
            dependencies {
                implementation("$gradleTag")
            }
            ```
        """.trimIndent())
    }
}