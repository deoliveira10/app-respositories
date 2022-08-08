package me.dio.app_repositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.app_repositories.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}